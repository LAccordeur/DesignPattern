package com.guoyang.remoteController;

/**
 * Created by L'Accordeur on 2016/11/23.
 */
public class NoCommand implements Command {
    public void execute() {
        System.out.println("No Command!");
    }

    public void undo() {
        System.out.println("No Command!");
    }
}
