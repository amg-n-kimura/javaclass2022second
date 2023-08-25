package jp.co.amgakuin.javaclss2022second.sampleblock.manager;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import jp.co.amgakuin.javaclss2022second.framework.GameController;
import jp.co.amgakuin.javaclss2022second.sampleblock.ui.Ball;
import jp.co.amgakuin.javaclss2022second.sampleblock.ui.colorball.BlueBall;
import jp.co.amgakuin.javaclss2022second.sampleblock.ui.colorball.GreenBall;
import jp.co.amgakuin.javaclss2022second.sampleblock.ui.colorball.MagentaBall;
import jp.co.amgakuin.javaclss2022second.sampleblock.ui.colorball.RedBall;
import jp.co.amgakuin.javaclss2022second.sampleblock.ui.colorball.YellowBall;
import lombok.Getter;

/**
 * ボール管理用シングルトン
 * @author 木村 信行
 *
 */
public class BallManager
{
    private final static BallManager me = new BallManager();

    @Getter
    private Ball myBall;

    private GameController gc;

    Map<Color, Ball> ballMap;

    Color[] ballColors = {
            Color.RED,
            Color.MAGENTA,
            Color.YELLOW,
            Color.GREEN,
            Color.BLUE,
    };

    private Color nextColor;

    private BallManager()
    {
        ballMap = new HashMap<>();
        for (int i = 0; i < BlockManager.BLOCK_VERTICAL; i++) {
            ballMap.put(ballColors[i], createColorBall(i));
        }
    }

    /**
     * インスタンスの取得
     * @return BallManager
     */
    public static BallManager getInstance()
    {
        return me;
    }

    /**
     * ボールマネージャーの初期化
     * @param GameController
     */
    public void initialize(GameController gameController)
    {
        gc = gameController;
        myBall = new Ball();
        gc.addObject(myBall);
    }

    private Ball createColorBall(int colorType)
    {
        switch (colorType) {
        case BlockManager.COLOR_TYPE_BLUE:
            return new BlueBall();
        case BlockManager.COLOR_TYPE_YELLOW:
            return new YellowBall();
        case BlockManager.COLOR_TYPE_RED:
            return new RedBall();
        case BlockManager.COLOR_TYPE_GREEN:
            return new GreenBall();
        case BlockManager.COLOR_TYPE_MAGENTA:
            return new MagentaBall();
        }
        return null;
    }

    public void changeColor(Color newColor)
    {
        nextColor = newColor;
    }

    public void changeColor()
    {
        gc.removeObject(myBall);
        Ball nextBall = ballMap.get(nextColor);
        nextBall.setX(myBall.getX());
        nextBall.setY(myBall.getY());
        nextBall.setDx(myBall.getDx());
        nextBall.setDy(myBall.getDy());
        myBall = nextBall;
        gc.addObject(myBall);
    }
}
