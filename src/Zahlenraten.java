import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {
    static void main() {
        Random zufall = new Random();
        Scanner sc = new Scanner(System.in);
        int geheimzahl = zufall.nextInt(100) + 1;

        int versuche = 0;
        boolean erraten = false;

        while (!erraten) {
            System.out.println("Bitte nenne eine Zahl zwischen 1 und 100: ");
            String guessInput = sc.nextLine().trim();
            int guess = Integer.parseInt(guessInput);
            versuche++;
            if (guess < geheimzahl) {
                System.out.println("Zu klein.");
            } else if (guess > geheimzahl) {
                System.out.println("Zu groß.");
            } else if (guess == geheimzahl) {
                System.out.println("Richtig geraten!");
                erraten = true;
            }
        }
        System.out.println("Erraten in " + versuche + " Versuchen.");
    }
}
