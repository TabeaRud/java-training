import java.util.Scanner;

public class Kalender {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welches Jahr ist es?");
        int jahr = Integer.parseInt(sc.nextLine().trim());

        boolean istSchaltjahr = (jahr % 4 == 0 && jahr % 100 != 0) || jahr % 400 == 0;
        if (istSchaltjahr) {
            System.out.println(jahr + " ist ein Schaltjahr.");
        } else {
            System.out.println(jahr + " ist kein Schaltjahr.");
        }

        System.out.println();
        System.out.println("Nenne eine Zahl von 1 bis 7: ");
        int zahl = Integer.parseInt(sc.nextLine().trim());

        switch (zahl) {
            case 1 -> System.out.println("Montag.");
            case 2 -> System.out.println("Dienstag.");
            case 3 -> System.out.println("Mittwoch.");
            case 4 -> System.out.println("Donnerstag.");
            case 5 -> System.out.println("Freitag.");
            case 6, 7 -> System.out.println("Wochenende.");
            default -> System.out.println("Das ist kein Wochentag.");
        }
    }
}