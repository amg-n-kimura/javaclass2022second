package jp.co.amgakuin.javaclss2022second.sampleblock.ui;

import java.awt.Graphics;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;
import jp.co.amgakuin.javaclss2022second.sampleblock.manager.BallManager;
import jp.co.amgakuin.javaclss2022second.sampleblock.manager.ScoreManager;
import lombok.Getter;
import lombok.Setter;

public class Block extends DisplayObject
{
    public final static int BLOCK_WIDTH = 40;
    public final static int BLOCK_HEIGHT = 10;

    /**
     * ブロックが残っているかどうか
     * 　残っていたらtrue
     */
    @Getter
    @Setter
    private boolean alive = false;

    /**
     * 更新処理を行うメソッドスタブ
     *
     * @return 処理結果を返す
     */
    @Override
    public boolean update()
    {
        if (isAlive()) {
            Ball ball = BallManager.getInstance().getMyBall();
            //Ballクラスを取得して当たり判定を行う
            if (isHit(ball)) {
                BallManager.getInstance().changeColor(getColor());
                BallManager.getInstance().changeColor();
                //当たっていたら、自身を消す（setAlive(false)）
                setAlive(false);

                //スコア加算
                int score = ScoreManager.getInstance().getScore() + 100;
                ScoreManager.getInstance().setScore(score);

                //ボールの反転
                if (ball.getX() <= getX()) {
                    ball.setReverseX(-1);
                } else if (ball.getX() + Ball.RADIUS > getX() + Block.BLOCK_WIDTH) {
                    ball.setReverseX(1);
                }
                //ボールの反転
                ball.reverseY();
            }
        }
        return !isAlive();
    }

    /**
     * 描画処理を行うメソッドスタブ
     *
     * @param g 描画対象となる{@link Graphics}インスタンス
     */
    @Override
    public void draw(Graphics g)
    {
        // 残っていない場合は表示しない
        if (!isAlive()) {
            return;
        }
        g.setColor(getColor());
        g.fillRect(getX(), getY(), getWidth(), getHeight());

    }

    /**
     * GameControllerが初期化を終えた際に1度だけ呼び出される
     */
    @Override
    public void initialize()
    {
        setWidth(BLOCK_WIDTH);
        setHeight(BLOCK_HEIGHT);
        setAlive(true);
        setInitialized(true);
    }
}
