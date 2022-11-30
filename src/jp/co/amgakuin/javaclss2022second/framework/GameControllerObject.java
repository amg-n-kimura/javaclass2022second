package jp.co.amgakuin.javaclss2022second.framework;

import java.awt.Graphics;

import lombok.Getter;
import lombok.Setter;

/**
 * 処理対象のオブジェクトに必要なインターフェース
 * <p>
 * このインターフェースを実装しているオブジェクトのみ{@link GameController}に登録できる。
 * <p>
 * 登録されたオブジェクトはフレームごとに{@link GameControllerObject#update()}と
 * {@link GameControllerObject#draw(Graphics)}が呼び出される。
 *
 * @author kimura
 */
public abstract class GameControllerObject
{
    @Getter
    @Setter
    public boolean initialized;

    /**
     * 更新処理を行うメソッドスタブ
     *
     * @return 処理結果を返す
     */
    public abstract boolean update();

    /**
     * 描画処理を行うメソッドスタブ
     *
     * @param g 描画対象となる{@link Graphics}インスタンス
     */
    public abstract void draw(Graphics g);

    /**
     * GameControllerから毎フレームのupdate()呼び出し時に先立って呼び出される
     * 初期化が終了したら、initializedをtrueにすれば呼び出されなくなる
     */
    public abstract void initialize();

}
