package jp.co.amgakuin.javaclass2020second.blockgame.ui.colorball;

import java.awt.Color;

import jp.co.amgakuin.javaclass2022second.blockgame.ui.Ball;


public class MagentaBall extends Ball
{
    @Override
    public void initialize()
    {
        super.initialize();
        setColor(Color.MAGENTA);
    }
}
