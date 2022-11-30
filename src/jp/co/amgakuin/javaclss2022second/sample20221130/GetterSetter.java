package jp.co.amgakuin.javaclss2022second.sample20221130;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class GetterSetter
{
    @Getter
    private int getParam;

    @Setter
    private int setParam;

    @Getter
    @Setter
    private int param;
}
