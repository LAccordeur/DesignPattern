package com.guoyang.remoteController;

/**
 * Created by L'Accordeur on 2016/11/23.
 */
public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
