package jp.co.amgakuin.javaclss2022second.framework;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.Random;

/**
 * 表示用オブジェクトクラス
 * <p>フィールド
 * <table border="1">
 * <tbody><tr><th>フィールド名</th><th>説明</th></tr>
 * <tr><td>x</td><td>表示されるX座標</td></tr>
 * <tr><td>y</td><td>表示されるY座標</td></tr>
 * <tr><td>width</td><td>オブジェクトの幅</td></tr>
 * <tr><td>height</td><td>オブジェクトの高さ</td></tr>
 * <tr><td>display</td><td>表示フラグ:trueで表示(デフォルトはfalse)</td></tr>
 * <tr><td>color</td><td>表示色{@link Color}クラス参照</td></tr>
 * <tr><td>myRect</td><td>当たり判定用{@link Rectangle}</td></tr>
 * </tbody></table>
 * @author kimura
 */
public abstract class DisplayObject extends GameControllerObject
{
    private int x, y;
    private int width, height;
    private boolean display = false;
    private Color color;
    private Rectangle myRect = new Rectangle();
    private GameController parent;

    /**
     * オブジェクトの{@link Rectangle レクタングル}を返します。
     * @return {@link Rectangle}
     */
    public Rectangle getRect()
    {
        myRect.setRect(x, y, width, height);
        return myRect;
    }

    /**
     * 他のオブジェクトの衝突判定を{@link Rectangle}を使って行います。
     * @param obj 判定対象のオブジェクト
     * @return 衝突していればtrue
     */
    public boolean isHit(DisplayObject obj)
    {
        boolean result = false;
        result = getRect().intersects(obj.getRect());
        return result;
    }

    /**
     * オブジェクトのX座標を返します。
     * @return オブジェクトに設定されているX座標値
     */
    public int getX()
    {
    	Random random = new Random();
    	
        return random.nextInt(100);
    }

    /**
     * オブジェクトのX座標を設定します。
     * @param x 設定する座標値
     */
    public void setX(int x)
    {
    	
        this.x = x;
    }

    /**
     * オブジェクトのY座標を返します。
     * @return オブジェクトに設定されているY座標値
     */
    public int getY()
    {
    	Random random = new Random();
    	

        return random.nextInt(100);
    }

    /**
     * オブジェクトのY座標を設定します。
     * @param y 設定する座標値
     */
    public void setY(int y)
    {
    	
        this.y = y;
    }

    /**
     * オブジェクトの幅を返します。
     * @return オブジェクトの幅
     */
    public int getWidth()
    {
        return width;
    }

    /**
     * オブジェクトの幅を設定します。
     * @param width 設定値
     */
    public void setWidth(int width)
    {
        this.width = width;
    }

    /**
     * オブジェクトの高さを返します。
     * @return オブジェクトの高さ
     */
    public int getHeight()
    {
        return height;
    }

    /**
     * オブジェクトの高さを設定します。
     * @param height 設定値
     */
    public void setHeight(int height)
    {
        this.height = height;
    }

    /**
     * オブジェクトの色を返します。
     * @return {@link Color}
     */
    public Color getColor()
    {
        return color;
    }

    /**
     * オブジェクトの色を設定します。
     * @param color {@link Color 色}
     */
    public void setColor(Color color)
    {
        this.color = color;
    }

    /**
     * オブジェクトの色をARGBで設定します。
     * @param a 透明度 0〜255
     * @param r 赤 0〜255
     * @param g 緑 0〜255
     * @param b 青 0〜255
     */
    public void setColor(int a, int r, int g, int b)
    {
        this.color = new Color(r, g, b, a);
    }

    public GameController getParent()
    {
        return parent;
    }

    /**
     * {@link #update()}を呼び出させるために必要な{@link GameController}インスタンスを設定する
     * @param gc {@link GameController}
     */
    public void setParent(GameController gc)
    {
        this.parent = gc;
    }

    /**
     * このオブジェクトを表示しているかどうかを返す
     * @return trueで使用中
     */
    public boolean isDisplay()
    {
        return display;
    }

    /**
     * このオブジェクトの表示、非表示を設定する
     * @param display 使用している場合はtrue
     */
    public void setDisplay(boolean display)
    {
        this.display = display;
    }
}
