import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {
    static void main() {
        Random zufall = new Random();
        Scanner sc = new Scanner(System.in);
        int geheim = zufall.nextInt(100) + 1;
        int versuche = 0;
        boolean erraten = false;


        while (!erraten) {
            int geraten = liesZahl(sc, "Bitte nenne eine Zahl zwischen 1 und 100: ");
            String bewertung = bewerte(geraten, geheim);
            System.out.println(bewertung);

            if (bewertung.equalsIgnoreCase("Richtig geraten!")) {
                erraten = true;
            }
            versuche++;
        }
        druckeErgebnis(versuche);
    }

    static int liesZahl(Scanner in, String frage) {
        System.out.println(frage);
        String input = in.nextLine().trim();
        int geraten = Integer.parseInt(input);
        return geraten;
    }

    static String bewerte(int geraten, int geheim) {
        if (geraten < geheim) {
            return "Zu klein.";
        } else if (geraten > geheim) {
            return "Zu groß.";
        } else {
            return "Richtig geraten!";
        }
    }

    static void druckeErgebnis(int versuche) {
        System.out.println("Erraten in " + versuche + " Versuchen.");
    }
}

