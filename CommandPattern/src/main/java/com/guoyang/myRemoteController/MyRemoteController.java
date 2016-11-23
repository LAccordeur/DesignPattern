package com.guoyang.myRemoteController;

/**
 * Created by L'Accordeur on 2016/11/16.
 */
public class MyRemoteController {
    Commond[] commondsOn = new Commond[2];
    Commond[] commondsOff = new Commond[2];

    public void setCommondsOnOne(Commond commondsOnOne) {
        this.commondsOn[0] = commondsOnOne;
    }

    public void setCommondsOnTwo(Commond commondsOnTwo) {
        this.commondsOn[1] = commondsOnTwo;
    }

    public void setCommondsOffOne(Commond commondsOffOne) {
        this.commondsOff[0] = commondsOffOne;
    }

    public void setCommondsOffTwo(Commond commondsOffTwo) {
        this.commondsOff[1] = commondsOffTwo;
    }

    public void pressOneOn() {
        commondsOn[0].execute();
    }

    public void pressOneOff() {
        commondsOff[0].execute();
    }

    public void pressTwoOn() {
        commondsOn[1].execute();
    }

    public void pressTwoOff() {
        commondsOff[1].execute();
    }

}
