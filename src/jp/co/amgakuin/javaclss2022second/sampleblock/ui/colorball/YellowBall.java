package jp.co.amgakuin.javaclss2022second.sampleblock.ui.colorball;

import java.awt.Color;

import jp.co.amgakuin.javaclss2022second.sampleblock.ui.Ball;


public class YellowBall extends Ball
{
    @Override
    public void initialize()
    {
        super.initialize();
        setColor(Color.YELLOW);
    }
}
