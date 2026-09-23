public class Steckbrief {
    String vorname = "Tabea";
    int alter = 25;
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
    }
}
