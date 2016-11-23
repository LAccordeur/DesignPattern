package com.guoyang.simpleRemoteController;

/**
 * Created by L'Accordeur on 2016/11/16.
 */
public class LightCommand implements Command {
    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
