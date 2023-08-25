package jp.co.amgakuin.javaclss2022second.sampleblock.ui.colorball;

import java.awt.Color;

import jp.co.amgakuin.javaclss2022second.sampleblock.ui.Ball;


public class MagentaBall extends Ball
{
    @Override
    public void initialize()
    {
        super.initialize();
        setColor(Color.MAGENTA);
    }
}
