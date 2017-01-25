package com.guoyang.stateMachine;

/**
 * Created by L'Accordeur on 2016/12/10.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
