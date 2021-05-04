package component.test;

import component.Player;
import component.WinChecker;

/**
 * {{1,2,3}, {1,4,7}, {1,5,9}, {2,5,8}, {3,5,7},{3,6,9}, {4,5,6}, {7,8,9}}
 */


public class WinCheckerTester {
    public static void main(String[] args) {
        winnerCheckingTesting();
    }

    public static void winnerCheckingTesting() {
        Player playerX = Player.PLAYERX;
        playerX.addPosition(7);
        playerX.addPosition(8);
        playerX.addPosition(6);
        playerX.addPosition(9);

        System.out.println(WinChecker.winnerChecking(playerX));
    }
}
