package jp.co.amgakuin.javaclss2022second.sampleblock2.ui.colorball;

import java.awt.Color;

import jp.co.amgakuin.javaclss2022second.sampleblock2.ui.Ball;


public class RedBall extends Ball
{
    @Override
    public void initialize()
    {
        super.initialize();
        setColor(Color.RED);
    }
}
