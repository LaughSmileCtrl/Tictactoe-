package component;

public class WinChecker
{
    final private static int[][] targetPositions = {{1,2,3}, {1,4,7}, {1,5,9}, {2,5,8}, {3,5,7},{3,6,9}, {4,5,6}, {7,8,9}};

    public static boolean winnerChecking(Player player)
    {
        for (int i = 0; i < targetPositions.length; i++) {
            int[] position = targetPositions[i];
            int[] playerPosition = player.getPositions();
            int status = 0;

            for (int j = 0; j < position.length; j++) {
                for (int k = 0; k < playerPosition.length; k++) {
                    if (playerPosition[k] == position[j]) {
                        status++;
                    }

                    if (status >= 3) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

}