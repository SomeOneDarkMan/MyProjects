package MyRobot;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MyRobot {
    /*
    * этот класс может жмякать на компьютерные клавишы ))) и наверное еще много может
    *
    *
    *
    *
    * */
    public static void main(String[] args) throws AWTException {
        Robot myRobot = new Robot();


      /*  myRobot.keyPress(KeyEvent.VK_ALT);
        myRobot.keyPress(KeyEvent.VK_TAB);
        myRobot.keyPress(KeyEvent.VK_TAB);
        myRobot.keyPress(KeyEvent.VK_TAB);
        myRobot.keyRelease(KeyEvent.VK_ALT);*/

        myRobot.mouseMove(1800,10);

        myRobot.mousePress( InputEvent.BUTTON1_DOWN_MASK);

        myRobot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        myRobot.mouseMove(50,120);
        myRobot.mousePress( InputEvent.BUTTON1_DOWN_MASK);
        myRobot.delay (100);
        myRobot.mousePress( InputEvent.BUTTON1_DOWN_MASK);
        myRobot.mouseRelease( InputEvent.BUTTON1_DOWN_MASK);
        myRobot.delay (100);
        myRobot.mousePress( InputEvent.BUTTON1_DOWN_MASK);
        myRobot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        myRobot.delay (100);
        myRobot.mousePress( InputEvent.BUTTON1_DOWN_MASK);
        myRobot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);





    }
}
