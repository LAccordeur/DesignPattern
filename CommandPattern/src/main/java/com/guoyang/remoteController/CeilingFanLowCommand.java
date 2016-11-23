package com.guoyang.remoteController;

/**
 * Created by L'Accordeur on 2016/11/23.
 */
public class CeilingFanLowCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
        System.out.println("The speed of ceiling fan is " +  ceilingFan.getSpeed());
    }

    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
            System.out.println("The speed of ceilingfan is " +  ceilingFan.getSpeed());
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
            System.out.println("The speed of ceilingfan is " +  ceilingFan.getSpeed());
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
            System.out.println("The speed of ceilingfan is " +  ceilingFan.getSpeed());
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
            System.out.println("The speed of ceilingfan is " +  ceilingFan.getSpeed());
        }

    }
}