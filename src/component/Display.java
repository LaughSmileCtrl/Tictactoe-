package component;

public class Display {
    public static void setup() {
        System.out.println((char) 27 + "[32m");
        System.out.println((char) 27 + "[2J");
        System.out.print((char) 27 + "[1;1f");
        System.out.println("<<<<   TicTacToe   >>>> ");
        System.out.println("   By: LaughSmileCtrl   ");
        System.out.println();
        System.out.println(" 1      |2      |3       ");
        System.out.println("        |       |        ");
        System.out.println("  _ _ _ | _ _ _ | _ _ _  ");
        System.out.println(" 4      |5      |6       ");
        System.out.println("        |       |        ");
        System.out.println("  _ _ _ | _ _ _ | _ _ _  ");
        System.out.println(" 7      |8      |9       ");
        System.out.println("        |       |        ");
        System.out.println("        |       |        ");
    }

    public static void addPosition(char name, int index) {
        switch (index) {
            case (1):
                System.out.print((char) 27 + "[5;5f");
                System.out.print(name);
                System.out.print((char) 27 + "[14;17f");
                break;
            case (2):
                System.out.print((char) 27 + "[5;13f");
                System.out.print(name);
                System.out.print((char) 27 + "[14;17f");
                break;
            case (3):
                System.out.print((char) 27 + "[5;21f");
                System.out.print(name);
                System.out.print((char) 27 + "[14;17f");
                break;
            case (4):
                System.out.print((char) 27 + "[8;5f");
                System.out.print(name);
                System.out.print((char) 27 + "[14;17f");
                break;
            case (5):
                System.out.print((char) 27 + "[8;13f");
                System.out.print(name);
                System.out.print((char) 27 + "[14;17f");
                break;
            case (6):
                System.out.print((char) 27 + "[8;21f");
                System.out.print(name);
                System.out.print((char) 27 + "[14;17f");
                break;
            case (7):
                System.out.print((char) 27 + "[11;5f");
                System.out.print(name);
                System.out.print((char) 27 + "[14;17f");
                break;
            case (8):
                System.out.print((char) 27 + "[11;13f");
                System.out.print(name);
                System.out.print((char) 27 + "[14;17f");
                break;
            case (9):
                System.out.print((char) 27 + "[11;21f");
                System.out.print(name);
                System.out.print((char) 27 + "[14;17f");
                break;
        }
    }

    public static void shiftPlayer(char name) {
        System.out.println((char) 27 + "[32m");
        System.out.println((char) 27 + "[13;5f");
        System.out.print("Time for  " + name + "  = ");
    }

    public static void shiftPlayerClear() {
        System.out.println((char) 27 + "[13;5f");
        System.out.print("                          ");
    }

    public static void clearMessage() {
        System.out.println((char) 27 + "[32m");
        System.out.println((char) 27 + "[12;5f");
        System.out.println("                                                                                                         ");
        System.out.print((char) 27 + "[14;17f");

    }

    public static void message(String message) {
        System.out.println((char) 27 + "[31m");
        System.out.println((char) 27 + "[12;5f");
        System.out.println(message);
        System.out.print((char) 27 + "[14;17f");
    }

    public static void toDefault() {
        System.out.print((char) 27 + "[16;1f");
    }

}