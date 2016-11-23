package com.guoyang.remoteController;

/**
 * Created by L'Accordeur on 2016/11/23.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        Light light = new Light();
        CeilingFan ceilingFan = new CeilingFan();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        Command ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        Command ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        Command[] commands = new Command[]{lightOnCommand,ceilingFanHighCommand};
        Command macroCommand = new MacroCommand(commands);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommands(0,lightOnCommand,lightOffCommand);
        remoteController.setCommands(1,ceilingFanHighCommand,ceilingFanMediumCommand);
        remoteController.setCommands(2,ceilingFanLowCommand,ceilingFanOffCommand);
        remoteController.setCommands(3,macroCommand,macroCommand);

        remoteController.onButtonWasPressed(3);
        remoteController.onButtonWasPressed(1);
        remoteController.onButtonWasPressed(2);
        remoteController.offButtonWasPressed(2);
        remoteController.undoButtonWasPressed();
        remoteController.undoButtonWasPressed();
        remoteController.undoButtonWasPressed();
        remoteController.undoButtonWasPressed();

    }
}
