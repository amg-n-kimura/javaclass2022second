package jp.co.amgakuin.javaclss2022second.sampleblock2.ui.colorblock;

import java.awt.Color;

import jp.co.amgakuin.javaclss2022second.sampleblock2.ui.Block;

/**
 * 黄色いブロック
 * @author 木村 信行
 *
 */
public class YellowBlock extends Block
{
    public YellowBlock()
    {
        setColor(Color.YELLOW);
        score = 300;
    }
}
