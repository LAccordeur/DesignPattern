package simpleRemoteController;

import com.guoyang.simpleRemoteController.*;

/**
 * Created by L'Accordeur on 2016/11/16.
 */
public class SimpleRemoteControllerTest {
    public static void main(String[] args) {
        Light light = new Light();
        Command command = new LightCommand(light);
        SimpleRemoteController simpleRemoteController = new SimpleRemoteController(command);
        simpleRemoteController.buttonPressed();

        GarageDoorOpen garageDoorOpen = new GarageDoorOpen();
        Command command1 = new GarageDoorOpenCommand(garageDoorOpen);
        simpleRemoteController.setCommand(command1);
        simpleRemoteController.buttonPressed();
    }
}
