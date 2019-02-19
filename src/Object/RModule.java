package Object;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RModule {

    Robot robot;

    public RModule() {
        initiateRobot();
    }

    public static void MouseClick(String button, Robot r, int timeDelay, int timeDelayBetweenHoldAndRelease, int numberOfTimes) {
        int mouse;
        r.delay(timeDelay);
        switch (button) {
            case "left":
                System.out.println("left click made..");
                mouse = InputEvent.BUTTON1_MASK;
                break;
            case "right":
                System.out.println("right click made..");
                mouse = InputEvent.BUTTON3_MASK;
                break;
            case "middle":
                System.out.println("middle click made..");
                mouse = InputEvent.BUTTON2_MASK;
                break;
            default:
                System.out.println("ERROR. Left click would have be made..");
                mouse = InputEvent.BUTTON1_MASK;
                break;
        }
        for (int i = 0; i < numberOfTimes; i++) {
            r.mousePress(mouse);
            r.delay(timeDelayBetweenHoldAndRelease);
            r.mouseRelease(mouse);
            r.delay(timeDelayBetweenHoldAndRelease);
        }
    }

      public static void moveMouse(Robot r, int X, int Y, int delay) {
        r.delay(delay);
        r.mouseMove(X, Y);
    }

    public static void doubleClickMouse(Robot r, int delay) {
        r.delay(delay);
        r.mousePress(InputEvent.BUTTON1_MASK);
        r.mouseRelease(InputEvent.BUTTON1_MASK);
        r.delay(50);
        r.mousePress(InputEvent.BUTTON1_MASK);
        r.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    public static void paste(Robot r) {
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
    }

    public static void pasteText(String text, Robot r, int delay) {
        r.delay(delay);
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
    }

    private void initiateRobot() {
        try {
            robot = new Robot();
        } catch (Exception e) {
        }

    }

}
