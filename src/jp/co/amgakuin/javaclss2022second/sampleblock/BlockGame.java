package jp.co.amgakuin.javaclss2022second.sampleblock;

import java.awt.Color;

import jp.co.amgakuin.javaclss2022second.framework.GameController;
import jp.co.amgakuin.javaclss2022second.sampleblock.manager.BallManager;
import jp.co.amgakuin.javaclss2022second.sampleblock.manager.BlockManager;
import jp.co.amgakuin.javaclss2022second.sampleblock.ui.Ball;
import jp.co.amgakuin.javaclss2022second.sampleblock.ui.Block;
import jp.co.amgakuin.javaclss2022second.sampleblock.ui.Pad;
import jp.co.amgakuin.javaclss2022second.sampleblock.ui.Score;
import lombok.Getter;

/**
 * ブロックゲームサンプル
 */
public class BlockGame
{
    public final static int FREE_VERTICAL_FIELD = 300;

    private final static BlockGame me = new BlockGame();

    @Getter
    private int windowWidth;
    @Getter
    private int windowHeight;

    //Ballクラスのフィールド
    @Getter
    private Ball ball;

    //Padクラスのフィールド
    private Pad pad;

    //Scoreクラスのフィールド
    private Score score;

    public static BlockGame getInstance()
    {
        return me;
    }

    private BlockGame()
    {
        windowWidth = BlockManager.BLOCK_SPACE_HORIZONTAL
                + BlockManager.BLOCK_HORIZONTAL * (BlockManager.BLOCK_SPACE_HORIZONTAL + Block.BLOCK_WIDTH);
        windowHeight = BlockManager.BLOCK_SPACE_VERTICAL_HEADER
                + BlockManager.BLOCK_VERTICAL * (BlockManager.BLOCK_SPACE_VERTICAL + Block.BLOCK_HEIGHT);
        windowHeight += FREE_VERTICAL_FIELD;

        GameController gc = GameController.gameControllerCreate(windowWidth, windowHeight);
        gc.setBgColor(Color.BLACK);

        BlockManager.getInstance().initialize(gc);
        BallManager.getInstance().initialize(gc);
        pad = new Pad();
        gc.addKeyListener(pad);
        gc.addObject(pad);

        score = new Score();
        gc.addObject(score);

        gc.start();
        
        BallManager.getInstance().changeColor(BallManager.getInstance().getBallColors()[1]);
        BallManager.getInstance().changeColor();
    }

    public static void main(String[] argv)
    {
        BlockGame.getInstance();
    }
}
