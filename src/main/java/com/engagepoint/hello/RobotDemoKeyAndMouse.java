package com.engagepoint.hello;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

/** Launch NotePad, send key strokes, then send mouse events to exit. */
public class RobotDemoKeyAndMouse {
    public static Robot robot;

    public static void main(String[] args) {
        try {
            robot = new Robot();
            Runtime.getRuntime().exec("notepad.exe"); // launch NotePad
            robot.delay(1000);  // wait for NotePad to launch

            // Send keys to NotePad
            int [] keys = {
                    KeyEvent.VK_T,
                    KeyEvent.VK_E,
                    KeyEvent.VK_S,
                    KeyEvent.VK_T,
                    KeyEvent.VK_ENTER,
                    KeyEvent.VK_F,
                    KeyEvent.VK_U,
                    KeyEvent.VK_C,
                    KeyEvent.VK_K,
                    KeyEvent.VK_SPACE,
                    KeyEvent.VK_Y,
                    KeyEvent.VK_O,
                    KeyEvent.VK_U
            };
            for (int i = 0; i < keys.length; ++i) {
                sendKey(keys[i]);
            }


               // Send mouse event to exit NotePad
            // Need to check the (x, y) of the menu location
            sendMouseClick(55, 74);     // File
            sendMouseClick(50, 260);    // Exit
            sendKey(KeyEvent.VK_TAB);   // Don't save
            sendKey(KeyEvent.VK_ENTER);

        } catch (AWTException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /** helper method to send the given key to the active application */
    public static void sendKey(int keyCode) {
        robot.keyPress(keyCode);
        robot.keyRelease(keyCode);
        robot.delay(500); // for you to see the keystroke
    }

    /** helper method to send a mouse-click to the active application */
    public static void sendMouseClick(int x, int y) {
        robot.mouseMove(x, y);
        robot.delay(1000); // for you to see the move
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
}