import java.util.Scanner;

public class Kassenbon {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Product name?");
        String productName = scanner.nextLine().trim();

        System.out.println("Price in euro per product?");
        double pricePerProduct = Double.parseDouble(scanner.nextLine().trim().replace(",", "."));

        System.out.println("How many?");
        int quantity = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Is it food?");
        String isItFood = scanner.nextLine().trim().toLowerCase();
        boolean food = isItFood.contains("j") && isItFood.length() <= 2;

        int priceInCent = (int) Math.round(pricePerProduct * 100);
        System.out.println(priceInCent);

        int netto;
        if (food) {
            netto = priceInCent * 7 / 100;
        }
        else {
            netto = priceInCent * 19 / 100;
        }

        System.out.println();
        StringBuilder sb = new StringBuilder();
        sb.append("Product name: " + productName);
        sb.append("\nBrutto price per product: " + pricePerProduct + " Cents");
        sb.append("\nQuantity: " + quantity);
        sb.append("\nIs it food? " + isItFood);
        sb.append("\nNetto: " + netto + " Cents");
        String done = sb.toString();
        System.out.println(done);
    }
}
