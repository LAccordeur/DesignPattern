package com.guoyang.myRemoteController;

/**
 * Created by L'Accordeur on 2016/11/16.
 */
public class LightOffCommand implements Commond {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
