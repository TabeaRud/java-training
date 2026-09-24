import java.util.Scanner;

public class Temperatur {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Grad Celsius?");
        int celsius = Integer.parseInt(sc.nextLine().trim());
        double fahrenheit = (double) celsius * 9 / 5 + 32;

        System.out.printf("%d Grad Celsius sind %.1f Grad Fahrenheit.",  celsius, fahrenheit);
    }
}
