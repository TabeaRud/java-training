import java.util.Scanner;

public class Statistik {
    static void main() {
        int[] werte = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < werte.length; i++) {
            System.out.println("Bitte nenne eine Zahl: ");
            String inputZahl = sc.nextLine().trim();
            int zahl = Integer.parseInt(inputZahl);
            werte[i] = zahl;
        }

        int summe = 0;
        int maximum = werte[0];
        int minimum = werte[0];
        for (int wert : werte) {
            summe += wert;

            if (wert > maximum) {
                maximum = wert;
            }

            if (wert < minimum) {
                minimum = wert;
            }
        }

        double durchschnitt = (double) summe / werte.length;

        System.out.println("Summe " + summe);
        System.out.println("Durchschnitt: " + durchschnitt);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);

        for (int i = werte.length - 1; i >= 0; i--) {
            System.out.println(werte[i]);
        }
    }
}
