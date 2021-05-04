package component.test;

import component.Display;

public class DisplayTester {
    public static void main(String[] args) {
        setupTesting();
        changePositionTesting();
        messageTesting();
        shiftPlayerTesting();
        clearMessageTesting();
        toDefaultTesting();
    }

    public static void setupTesting() {
        Display.setup();
    }

    public static void changePositionTesting() {
        for (int i = 1; i < 9; i+=2) {
            Display.addPosition('X', i);
        }

        for (int i = 2; i < 9; i+=2) {
            Display.addPosition('O', i);
        }
    }
    public static void shiftPlayerTesting() {
        Display.shiftPlayer('X');
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        Display.shiftPlayer('O');
    }

    public static void messageTesting() {
        Display.message("This is Testing message");
    }
    public static void clearMessageTesting() {
        Display.clearMessage();
    }
    public static void toDefaultTesting() {
        Display.toDefault();
    }
}
