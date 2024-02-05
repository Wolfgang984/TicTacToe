package Uebungen;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Spieler 1, Wie ist deine Name");
        String p1 = in.nextLine();
        System.out.println("Spieler 2, Wie ist dein Name?");
        String p2 = in.nextLine();


        char[][] spielfeld = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                spielfeld[i][j] = '-';
        }

        boolean isPLayer1 = true;

        boolean gameEnded = false;

while (!gameEnded){
        printBoard(spielfeld); // Híer wird das spielfeld erstellt.


        char symbol = ' ';

        if (isPLayer1) {
            symbol = 'X';

        } else {
            symbol = 'O';
        }
        if (isPLayer1) {
            System.out.println(p1 + " ist am zug (X)");
        } else {
            System.out.println(p2 + " ist am Zug (O)");
        }
        int row = 0;
        int col = 0;


        // Welche Zeile uns spalte wählt der User
        while (true) {
            System.out.println("Enter a row (0, 1 or 2): ");
            row = in.nextInt();
            System.out.println("Enter a col (0, 1 or 2): ");
            col = in.nextInt();

            //Überprüfen Sie, ob Zeile und Spalte gültig sind

            if (row < 0 || col < 0 || row > 2 || col > 2) {
                System.out.println("Die Eingabe ist ausserhalb des Spielfeldes!");
            } else if (spielfeld[row][col] != '-') {
                System.out.println("Dieser spielzug wurde bereits verwendet");
            } else {
                break;
            }

        }

        spielfeld[row][col] = symbol;

        if (hatGewonnen(spielfeld) == 'X') {
            System.out.println(p1 + "Hat Gewonnen!");
            gameEnded = true;
        } else if (hatGewonnen(spielfeld) == 'O') {
            System.out.println(p2 + "Hat Gewonnen!");
            gameEnded = true;
        } else {

            if (istVoll(spielfeld)) {
                System.out.println("Es ist Unentschieden!");
                gameEnded = true;
            } else {
                isPLayer1 = !isPLayer1;
            }
        }
    }
    }

    public static void printBoard(char[][] spielfeld) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(spielfeld[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char hatGewonnen(char[][] spielfeld) {

        //Reihe
        for (int i = 0; i < 3; i++) {
            if (spielfeld[i][0] == spielfeld[i][1] && spielfeld[i][1] == spielfeld[i][2] && spielfeld[i][0] != '-') {
                return spielfeld[i][0];
            }

        }

        //spalte
        for (int j = 0; j < 3; j++) {
            if (spielfeld[0][j] == spielfeld[1][j] && spielfeld[1][j] == spielfeld[2][j] && spielfeld[0][j] != '-') {
                return spielfeld[0][j];
            }

        }
//Diagonale
        if (spielfeld[0][0] == spielfeld[1][1] && spielfeld[1][1] == spielfeld[2][2] && spielfeld[0][0] != '-') {
            return spielfeld[0][0];
        }
        if (spielfeld[2][0] == spielfeld[1][1] && spielfeld[1][1] == spielfeld[0][2] && spielfeld[2][0] != '-') {
            return spielfeld[2][0];
        }
        return '-';
    }

    // check ob das spielfeld voll ist

    public static boolean istVoll(char[][] spielfeld) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                if (spielfeld[i][j] == '-') {
                    return false;
                }
        }
        return true;
    }
}

