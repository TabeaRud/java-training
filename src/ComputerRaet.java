import java.util.Scanner;

public class ComputerRaet {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int unten = 1;
        int oben = 100;
        int versuche = 0;
        boolean erraten = false;
        int k;
        int g;
        int zahl = 16;

        while (!erraten) {
            int tipp = (unten + oben) / 2;
            System.out.printf("Ist es %d?", tipp);
            String input = sc.nextLine().trim();
            versuche++;

            if (input.equalsIgnoreCase("k")) {
                oben = tipp - 1;
            } else if (input.equalsIgnoreCase("g")) {
                unten = tipp + 1;
            } else if (input.equalsIgnoreCase("r")) {
                erraten = true;
                System.out.printf("Die Zahl war %d, du hast %d Versuche gebraucht.", zahl, versuche);
            }

            if (unten > oben) {
                System.out.println("Du schummelst!");
                return;
            }
        }
    }
}
