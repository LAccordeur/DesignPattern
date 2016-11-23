package myRemoteController;

import com.guoyang.myRemoteController.*;

/**
 * Created by L'Accordeur on 2016/11/16.
 */
public class MyRemoteControllerTest {
    public static void main(String[] args) {
        Light light = new Light();
        CeilingFan ceilingFan = new CeilingFan();


        Commond ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        Commond ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        Commond lightOnCommand = new LightOnCommand(light);
        Commond lightOffCommand = new LightOffCommand(light);

        MyRemoteController myRemoteController = new MyRemoteController();
        myRemoteController.setCommondsOffOne(lightOffCommand);
        myRemoteController.setCommondsOnOne(lightOnCommand);
        myRemoteController.setCommondsOffTwo(ceilingFanOffCommand);
        myRemoteController.setCommondsOnTwo(ceilingFanOnCommand);

        myRemoteController.pressTwoOff();
    }
}


