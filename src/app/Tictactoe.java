package app;

import component.Display;
import component.Player;
import component.PositionValidator;
import component.WinChecker;

import java.util.Scanner;

public class Tictactoe {
    public static void main(String[] args) {
        Player[] players = {Player.PLAYERX, Player.PLAYERO};
        Scanner terminalScanner = new Scanner(System.in);
        char firstPlayer;
        int playerTurn;

        do {
            System.out.print("First(X/O) ? ");
            firstPlayer = terminalScanner.nextLine().charAt(0);
        } while (!(firstPlayer == 'X' || firstPlayer == 'O'));

        if (firstPlayer == 'X') {
            playerTurn = 0;
        } else {
            playerTurn = 1;
        }

        Display.setup();
        for (int i = 0; i < 9; i++) {
            boolean isExists = false;
            int n;
            do {
                if (isExists) {
                    Display.message("Pick another position");
                }

                Display.shiftPlayerClear();
                Display.shiftPlayer(players[playerTurn].getIcon());
                n = terminalScanner.nextInt();
                terminalScanner.nextLine();
                Display.clearMessage();
                isExists = PositionValidator.isExistsPosition(n, players);
                isExists = isExists || n < 1 || n > 9;
            }while (isExists);

            players[playerTurn].addPosition(n);
            Display.addPosition(players[playerTurn].getIcon(), n);

            if (WinChecker.winnerChecking(players[playerTurn])) {
                Display.message(players[playerTurn].getIcon() + " The Winner");
                break;
            }

            playerTurn = (playerTurn == 1) ? 0 : 1;
        }

        Display.toDefault();
        terminalScanner.close();
    }
}
