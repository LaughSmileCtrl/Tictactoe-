package component;

import java.util.Arrays;

public class PositionValidator {

    public static boolean isExistsPosition(int insertPosition, Player[] players) {

        for (Player player: players) {
            for (int n: player.getPositions()) {
             if(n == insertPosition) {
                 return true;
             }
            }
        }

        return false;
    }
}
