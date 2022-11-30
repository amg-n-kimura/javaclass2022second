package jp.co.amgakuin.javaclss2022second.framework;

/**
 * {@link DisplayObject}参照
 * @author kimura
 */
public abstract class MoveObject extends DisplayObject
{
    private int dx, dy;

    public int getDx()
    {
        return dx;
    }

    public void setDx(int dx)
    {
        this.dx = dx;
    }

    public int getDy()
    {
        return dy;
    }

    public void setDy(int dy)
    {
        this.dy = dy;
    }

}
