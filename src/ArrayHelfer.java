import java.util.Arrays;

public class ArrayHelfer {
    static void main() {
        int[] werte = {1, 6, 4, 10, 3};
        int summe = arraySumme(werte);
        System.out.println(summe);
        int maximum = arrayMaximum(werte);
        System.out.println(maximum);
        int minimum = arrayMinimum(werte);
        System.out.println(minimum);
        double durchschnitt = durchschnitt(werte, arraySumme(werte));
        System.out.println(durchschnitt);
        System.out.println();
        int[] werteKopie = umgekehrt(werte);

        System.out.println("Original Array: " + Arrays.toString(werte));
        System.out.println("Umgekehrtes Array: " + Arrays.toString(werteKopie));

        System.out.println();
        boolean istPrimzahl = istPrimzahl(7);
        System.out.println("Ist Primzahl: " + istPrimzahl);

        int ggt = ggt(12, 6);
        System.out.println("Der GGT ist: " + ggt);
    }

    static int arraySumme(int[] werte) {
        int sum = 0;
        for (int wert : werte) {
            sum += wert;
        }
        return sum;
    }

    static int arrayMaximum(int[] werte) {
        int maximum = werte[0];
        for (int wert : werte) {
            if (wert > maximum) {
                maximum = wert;
            }
        }
        return maximum;
    }

    static int arrayMinimum(int[] werte) {
        int minimum = werte[0];
        for (int wert : werte) {
            if (wert < minimum) {
                minimum = wert;
            }
        }
        return minimum;
    }

    static double durchschnitt(int[] werte, int summe) {
        double durchschnitt = (double) summe / werte.length;
        return durchschnitt;
    }

    static int[] umgekehrt(int[] werte) {
        int[] werteKopie = new int[werte.length];
        for (int i = 0; i < werte.length; i++) {
            werteKopie[werteKopie.length - 1 - i] = werte[i];
        }
        return werteKopie;
    }

    static boolean istPrimzahl(int n) {
        boolean istPrimzahl = true;
        if (n % 2 == 0) {
            istPrimzahl = false;
        } else if (n % 3 == 0) {
            istPrimzahl = false;
        }
        return istPrimzahl;
    }

    static int ggt(int a, int b) {
        while (b != 0) {
            int ggt = a % b;
            a = b;
            b = ggt;
        }
        return a;
    }
}

