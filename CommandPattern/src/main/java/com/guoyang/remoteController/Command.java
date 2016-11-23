package com.guoyang.remoteController;

/**
 * Created by L'Accordeur on 2016/11/16.
 */
public interface Command {
    void execute();
    void undo();
}
