import java.util.Scanner;

public class Kassenbon {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Product name?");
        String productName = scanner.nextLine().trim();

        System.out.println("Price in euro per product?");
        double pricePerProduct = Double.parseDouble(
                scanner.nextLine().trim().replace(",", ".")
        );

        System.out.println("How many?");
        int quantity = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Is it food?");
        String isItFood = scanner.nextLine().trim().toLowerCase();
        boolean food = isItFood.equals("j") || isItFood.equals("ja");

        // Preis einmalig in Cent umrechnen
        int priceInCent = (int) Math.round(pricePerProduct * 100);

        // Gesamt-Netto
        int netto = priceInCent * quantity;

        // Steuer
        int steuer;
        if (food) {
            steuer = Math.round(netto * 7 / 100.0f);
        } else {
            steuer = Math.round(netto * 19 / 100.0f);
        }

        // Brutto
        int brutto = netto + steuer;

        // StringBuilder für den gesamten Bon
        StringBuilder sb = new StringBuilder();

        sb.append("=== KASSENBON ===");
        sb.append("\nProdukt: " + productName);
        sb.append("\nPreis pro Stück: " + String.format("%.2f", priceInCent / 100.0).replace(".", ",") + " EUR");
        sb.append("\nMenge: " + quantity);
        sb.append("\nLebensmittel: " + isItFood);
        sb.append("\n-----------------");
        sb.append("\nNetto: " + String.format("%.2f", netto / 100.0).replace(".", ",") + " EUR");
        sb.append("\nSteuer: " + String.format("%.2f", steuer / 100.0).replace(".", ",") + " EUR");
        sb.append("\nBrutto: " + String.format("%.2f", brutto / 100.0).replace(".", ",") + " EUR");

        System.out.println(sb);
    }
}