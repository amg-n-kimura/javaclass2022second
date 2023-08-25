package jp.co.amgakuin.javaclss2022second.sampleblock2.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import jp.co.amgakuin.javaclss2022second.framework.MoveObject;
import jp.co.amgakuin.javaclss2022second.sampleblock2.BlockGame;
import jp.co.amgakuin.javaclss2022second.sampleblock2.manager.BallManager;


public class Pad extends MoveObject implements KeyListener
{

    public final static int PAD_WIDTH = 50;
    public final static int PAD_HEIGHT = 10;

    public final static int PAD_MOVE = 2;

    /**
     * キーが押されているかどうか
     */
    private boolean keyPressed = false;

    private int keyCode = 0;

    @Override
    public boolean update()
    {
        // TODO 自動生成されたメソッド・スタブ
        int newX = getX();
        if (keyPressed) {
            if (keyCode == KeyEvent.VK_LEFT) {
                newX -= PAD_MOVE;
            } else if (keyCode == KeyEvent.VK_RIGHT) {
                newX += PAD_MOVE;
            }
            if (newX < 0) {
                newX = 0;
            } else if (newX + PAD_WIDTH >= BlockGame.getInstance().getWindowWidth()) {
                newX = BlockGame.getInstance().getWindowWidth() - PAD_WIDTH;
            }
            setX(newX);
        }
        //Ballクラスを取得して当たり判定を行う
        Ball ball = BallManager.getInstance().getMyBall();
        if (isHit(ball)) {
            //パッドの左または右と当たっているかどうか
            if (ball.getX() <= getX()) {
                ball.setReverseX(-1);
            } else if (ball.getX() + Ball.RADIUS > getX() + PAD_WIDTH) {
                ball.setReverseX(1);
            }
            //ボールの反転
            ball.reverseY();
        }
        return false;
    }

    @Override
    public void draw(Graphics g)
    {
        // TODO 自動生成されたメソッド・スタブ
        g.setColor(getColor());
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public void initialize()
    {
        // TODO 自動生成されたメソッド・スタブ
        setWidth(PAD_WIDTH);
        setHeight(PAD_HEIGHT);
        setColor(Color.WHITE);
        setX(20);
        setY(320);
        setInitialized(true);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        // TODO 自動生成されたメソッド・スタブ
        keyPressed = true;
        keyCode = e.getKeyCode();
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        // TODO 自動生成されたメソッド・スタブ
        keyPressed = false;
        keyCode = 0;
    }

}
