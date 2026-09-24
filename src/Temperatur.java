import java.util.Scanner;

public class Temperatur {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Grad Celsius?");
        int celsius = Integer.parseInt(sc.nextLine().trim());
        int fahrenheit = celsius * 9 / 5 + 32;

        System.out.println(celsius + " Grad Celsius sind " + fahrenheit + " Grad Fahrenheit.");
    }
}
