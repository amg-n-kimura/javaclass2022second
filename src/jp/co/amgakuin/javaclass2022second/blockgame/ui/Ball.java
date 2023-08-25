package jp.co.amgakuin.javaclass2022second.blockgame.ui;

import java.awt.Color;
import java.awt.Graphics;

import jp.co.amgakuin.javaclass2022second.blockgame.BlockGame;
import jp.co.amgakuin.javaclss2022second.framework.MoveObject;

public class Ball extends MoveObject
{
    public final static int RADIUS = 10;

    private boolean reversed = false;

    /**
     * Y方向の反転
     */
    public void reverseY()
    {
        if (!reversed) {
            setDy(getDy() * -1);
            reversed = true;
        }
    }

    public void setReverseX(int dir)
    {
        if (!reversed) {
            setDx(Math.abs(getDx()) * dir);
            reversed = true;
        }
    }

    @Override
    public boolean update()
    {
        // TODO 自動生成されたメソッド・スタブ
        // 現在位置を確認して方向転換させる
        int newX = getX() + getDx();
        if (newX >= BlockGame.getInstance().getWindowWidth() - RADIUS || newX <= 0) {
            setDx(getDx() * -1);
        }
        int newY = getY() + getDy();
        if (newY >= BlockGame.getInstance().getWindowHeight() - RADIUS || newY <= 0) {
            setDy(getDy() * -1);
        }

        setX(getX() + getDx());
        setY(getY() + getDy());
        if (reversed) {
            reversed = false;
        }
        return false;
    }

    @Override
    public void draw(Graphics g)
    {
        // TODO 自動生成されたメソッド・スタブ
        g.setColor(getColor());
        g.fillOval(getX(), getY(), RADIUS, RADIUS);
    }

    @Override
    public void initialize()
    {
        // TODO 自動生成されたメソッド・スタブ
        setColor(Color.WHITE);
        setX(40);
        setY(200);
        setWidth(RADIUS);
        setHeight(RADIUS);
        setDx(1);
        setDy(1);
        setInitialized(true);
    }

}
