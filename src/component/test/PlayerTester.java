package component.test;

import component.Player;

public class PlayerTester {
    public static void main(String[] args) {
        Player playerX = Player.PLAYERX;
        getIconTesting(playerX);
        addPosistionTesting(playerX);
        getPositionsTesting(playerX);
    }
    public static void getIconTesting(Player player) {
        System.out.println(player.getIcon());
    }

    public static void addPosistionTesting(Player player) {
        for (int i = 6; i > 1; i--) {
            player.addPosition(i);
            System.out.println(i);
        }
    }

    public static void getPositionsTesting(Player player) {
        for (int n : player.getPositions()) {
            System.out.println(n);
        }
    }
}
