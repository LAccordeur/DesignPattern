package com.guoyang.remoteController;

/**
 * Created by L'Accordeur on 2016/11/23.
 */
public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
