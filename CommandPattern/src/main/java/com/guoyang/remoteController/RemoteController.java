package com.guoyang.remoteController;


import com.guoyang.util.Stack;

/**
 * Created by L'Accordeur on 2016/11/16.
 */
public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;
    Stack undoStack = new Stack(10);

    public RemoteController() {
        onCommands = new Command[4];
        offCommands = new Command[4];
        Command noCommand = new NoCommand();

        for (int i = 0;i < 4;i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoStack.push(noCommand);
    }

    public void setCommands(int slot,Command onCommand,Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();

        if (!undoStack.isFull()) {
            undoStack.push(onCommands[slot]);
        }
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();

        if (!undoStack.isFull()) {
            undoStack.push(offCommands[slot]);
        }
    }

    public void undoButtonWasPressed() {

        if (!undoStack.isEmpty()) {
            Command command = (Command) undoStack.pop();
            command.undo();
        }
    }

}
