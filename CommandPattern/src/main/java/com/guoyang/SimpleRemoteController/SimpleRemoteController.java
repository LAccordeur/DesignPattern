package com.guoyang.simpleRemoteController;

/**
 * Created by L'Accordeur on 2016/11/16.
 */
public class SimpleRemoteController {
    private Command command;

    public SimpleRemoteController(Command command) {
        this.command = command;
    }

    public SimpleRemoteController() {}

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPressed() {
        command.execute();
    }

}
