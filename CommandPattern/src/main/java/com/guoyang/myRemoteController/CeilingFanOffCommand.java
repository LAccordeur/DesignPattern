package com.guoyang.myRemoteController;

/**
 * Created by L'Accordeur on 2016/11/16.
 */
public class CeilingFanOffCommand implements Commond {
    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.off();
    }
}
