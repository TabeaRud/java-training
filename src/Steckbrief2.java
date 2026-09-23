import java.util.Scanner;

public class Steckbrief2 {
    static void main(String[] args) {

        int yearOfBirth = 2026;
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = sc.nextLine();

        System.out.println("What's your age?");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("What's your height?");
        double height = Double.parseDouble(sc.nextLine());

        System.out.printf("%s is %d years old, her height is %.2f meters and she was born in %d.", name, age, height, yearOfBirth);
        System.out.println();
        System.out.println();
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println((name.charAt(0)));

        System.out.println("Do you drink coffee?");
        String drinkCoffee = sc.nextLine();

        System.out.println(drinkCoffee.equalsIgnoreCase("yes"));
    }
}