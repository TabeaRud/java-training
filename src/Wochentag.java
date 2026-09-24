import java.util.Scanner;

public class Wochentag {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nenne einen Tag im Monat als Zahl: ");
        String input = sc.nextLine().trim();
        int tag = Integer.parseInt(input);

        System.out.println("Nenne einen Monat von 1 bis 12: ");
        String input2 = sc.nextLine().trim();
        int monat = Integer.parseInt(input2);

        System.out.println("Nenne ein Jahr: ");
        String input3 = sc.nextLine().trim();
        int jahr = Integer.parseInt(input3);

        int anzahlTage = tageImMonat(monat, jahr);
        boolean validesDatum = (monat >= 1 && monat <= 12) && (tag >= 1 && tag <= anzahlTage);

        if (!validesDatum) {
            System.out.println("Kein valides Datum.");
            return;
        }

        if (monat == 1 || monat == 2) {
            monat += 12;
            jahr -= 1;
        }

        int wochentagNummer = (tag + ((13 * (monat + 1)) / 5) + (jahr % 100) + (jahr % 100 / 4) + ((jahr / 100) / 4) - 2 * (jahr / 100)) % 7;
        System.out.println(wochentagNummer);

        switch (wochentagNummer) {
            case 0 -> System.out.println("Samstag");
            case 1 -> System.out.println("Sonntag");
            case 2 -> System.out.println("Montag");
            case 3 -> System.out.println("Dienstag");
            case 4 -> System.out.println("Mittwoch");
            case 5 -> System.out.println("Donnerstag");
            case 6 -> System.out.println("Freitag");
        }

    }

    static boolean istSchaltjahr(int jahr) {
        return (jahr % 4 == 0 && jahr % 100 != 0) || jahr % 400 == 0;
    }

    static int tageImMonat(int monat, int jahr) {
        int tageImFebruar = istSchaltjahr(jahr) ? 29 : 28;

        int wochentage = switch (monat) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> tageImFebruar;
            default -> 30;
        };
        return wochentage;
    }
}