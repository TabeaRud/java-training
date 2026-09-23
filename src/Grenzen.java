public class Grenzen {
    static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 1); // Überschreitet den Wert, den ein Integer halten kann. Resultat ist kein Error, aber falsche Zahl.

        int sekunden = 70 * 365 * 24 * 60 * 60;
        System.out.println(sekunden);
        long gelebteSekunden = 70L * 365 * 24 * 60 * 60;
        System.out.println(gelebteSekunden); // Long kann größere Zahlen halten.

        System.out.println(0.1 + 0.2);
        System.out.println(0.1 + 0.2 == 0.3); // Das tatsächliche Ergebnis wäre 0.30000000000000004 weil Double ungenauer sind.
        System.out.println(1 + 2 == 3); // Integer sind genauer.
    }
}
