package component.test;

import component.Player;
import component.PositionValidator;

public class PositionValidatorTester {
    public static void main(String[] args) {
        isExistsPositionTesting();
    }

    public static void isExistsPositionTesting() {
        Player playerX = Player.PLAYERX;
        Player playerO = Player.PLAYERO;
        Player[] players = {playerO, playerX};

        playerX.addPosition(1);
        playerX.addPosition(3);
        playerX.addPosition(5);
        playerX.addPosition(8);
        playerX.addPosition(2);
        int n = 1;
        for (int i = 1; n <=5 && i <= 9; i++) {
            boolean isExists = PositionValidator.isExistsPosition(i, players);
            if (!isExists) {
                n++;
                playerO.addPosition(i);
                System.out.println(i);
            }
        }

    }
}
