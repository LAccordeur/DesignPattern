package com.guoyang.simpleRemoteController;

/**
 * Created by L'Accordeur on 2016/11/16.
 */
public class GarageDoorOpenCommand implements Command {
    private GarageDoorOpen garageDoorOpen;

    public GarageDoorOpenCommand(GarageDoorOpen garageDoorOpen) {
        this.garageDoorOpen = garageDoorOpen;
    }

    public void execute() {
        garageDoorOpen.openGarageDoor();
    }
}
