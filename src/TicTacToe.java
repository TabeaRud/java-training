import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    void main() {
        Scanner sc = new Scanner(System.in);
        char[][] brett = new char[3][3];
        leere(brett);

        char spieler = 'x';
        int gespielteZuege = 0;
        while (gespielteZuege < 9) {
            drucke(brett);
            System.out.println("Zeile (0-2)?");
            int zeile = sc.nextInt();
            System.out.println("Spalte (0-2)?");
            int spalte = sc.nextInt();

            if (brett[zeile][spalte] != '.') {
                System.out.println("Besetzt.");
            } else if (brett[zeile][spalte] == '.') {
                gespielteZuege++;
                setze(brett, zeile, spalte, spieler);
                if (spieler == 'x') {
                    spieler = 'o';
                } else {
                    spieler = 'x';
                }
                System.out.println("Super, nächster Spieler!");
            }
        }
    }

    static void leere(char[][] brett) {
        for (int zeile = 0; zeile < brett.length; zeile++) {
            for (int spalte = 0; spalte < brett[zeile].length; spalte++) {
                brett[zeile][spalte] = '.';
            }
        }
    }

    static void drucke(char[][] brett) {
        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett[i].length; j++) {
                System.out.print(brett[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean setze(char[][] brett, int zeile, int spalte, char spieler) {
        if (brett[zeile][spalte] == '.') {
            brett[zeile][spalte] = spieler;
            return true;
        }
        return false;
    }
}


