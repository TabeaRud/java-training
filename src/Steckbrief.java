public class Steckbrief {
    String vorname = "Tabea";
    int alter = 120;
    double koerpergroesse = 1.65;
    char lieblingsbuchstabe = 'S';
    boolean trinktKaffee = false;

    int geburtsjahr = 2026 - alter;
    int koerpergroesseInZentimetern = (int) (1.65 * 100);


    void main(String[] args) {
        System.out.println("Vorname: " + vorname);
        System.out.println("Alter: " + alter);
        System.out.println("Körpergröße: " + koerpergroesse);
        System.out.println("Körpergröße in Zentimetern: " + koerpergroesseInZentimetern);
        System.out.println("Liebingsbuchstabe: " + lieblingsbuchstabe);
        System.out.println("Trinkt Kaffee: " + (trinktKaffee ? "Ja" : "Nein"));
        System.out.println("Geburtsjahr: " + geburtsjahr);

        int gelebteTage = alter * 365; // Niedrigere Zahl kann auch von int gehalten werden
        System.out.println("Gelebte Tage: " + gelebteTage);
        long gelebteSekunden = alter * 365 * 24 * 60 * 60L; // Sehr hohe Zahl, als long
        System.out.println("Gelebte Sekunden: "  + gelebteSekunden);
        long herzschlaege = (long) alter * 365 * 24 * (60 * 70) * 60; // Auch hier hohe Zahl
        System.out.println("Herzschläge: " + herzschlaege);

        System.out.println(8 / 24); // 0; 8 ist nicht durch 24 teilbar, also kommt eine Kommazahl raus, die durch Integer nicht abgebildet wird
        System.out.println(8.0 / 24); // 0.3333; Durch die Umwandlung der 8 zu einem Double, können die Nachkommastellen abgebildet werden

        System.out.printf("%,d", Long.MAX_VALUE);
    }
}
