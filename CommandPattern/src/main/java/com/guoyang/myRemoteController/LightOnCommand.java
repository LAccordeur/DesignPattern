package com.guoyang.myRemoteController;

/**
 * Created by L'Accordeur on 2016/11/16.
 */
public class LightOnCommand implements Commond {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
