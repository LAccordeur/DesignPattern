package com.guoyang.myRemoteController;

/**
 * Created by L'Accordeur on 2016/11/16.
 */
public class CeilingFanOnCommand implements Commond{
    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }


    public void execute() {
        ceilingFan.on();
    }
}
