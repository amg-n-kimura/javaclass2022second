package jp.co.amgakuin.javaclss2022second.sampleblock2.manager;

import lombok.Getter;
import lombok.Setter;

public class ScoreManager
{
    private final static ScoreManager me = new ScoreManager();

    @Getter
    @Setter
    private int score = 0;

    public static ScoreManager getInstance()
    {
        return me;
    }

    private ScoreManager()
    {

    }

}
