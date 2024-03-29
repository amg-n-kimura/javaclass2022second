package jp.co.amgakuin.javaclss2022second.sampleblock.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;
import jp.co.amgakuin.javaclss2022second.sampleblock.manager.BlockManager;
import jp.co.amgakuin.javaclss2022second.sampleblock.manager.ScoreManager;


public class Score extends DisplayObject
{
    private Font font = new Font(Font.MONOSPACED, Font.BOLD, BlockManager.BLOCK_SPACE_VERTICAL_HEADER - 2);

    @Override
    public boolean update()
    {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    @Override
    public void draw(Graphics g)
    {
        // TODO 自動生成されたメソッド・スタブ
        g.setFont(font);
        g.setColor(Color.WHITE);
        g.drawString("SCORE " + ScoreManager.getInstance().getScore(), 0, g.getFontMetrics().getAscent());
    }

    @Override
    public void initialize()
    {
        // TODO 自動生成されたメソッド・スタブ

        setInitialized(true);
    }

}
