import java.util.Scanner;

public class Statistik2 {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] werte = new int[4];
        int anzahl = 0;
        int summe = 0;

        while (true) {
            System.out.println("Zahl eingeben (leer zum Beenden): ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                break;
            }

            int zahl = Integer.parseInt(input);
            if (anzahl == werte.length) {
                int[] neuesArray = new int[werte.length * 2];

                for (int i = 0; i < werte.length; i++) {
                    neuesArray[i] = werte[i];
                }
                werte = neuesArray;
            }
            werte[anzahl] = zahl;
            anzahl++;
        }

        int maximum = werte[0];
        int minimum = werte[0];
        for (int i = 0; i < anzahl; i++) {
            summe += werte[i];

            if (werte[i] > maximum) {
                maximum = werte[i];
            }

            if (werte[i] < minimum) {
                minimum = werte[i];
            }
        }

        double durchschnitt = (double) summe / anzahl;

        System.out.println("Summe: " + summe);
        System.out.println("Durchschnitt: " + durchschnitt);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);

        int[] sortiertesArray = new int[anzahl];
        for (int i = 0; i < sortiertesArray.length; i++) {
            sortiertesArray[i] = werte[i];
        }


    }
}
