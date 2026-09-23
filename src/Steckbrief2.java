import java.util.Scanner;

public class Steckbrief2 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What's your full name?");
        String nameInput = sc.nextLine().trim();
        int spaceName;
        String name;
        String surname;

        if (nameInput.contains(" ")) {
            spaceName = nameInput.indexOf(" ");
            name = nameInput.substring(0, spaceName);
            surname = nameInput.substring(spaceName + 1);
        } else {
            name = nameInput;
            surname = " ";
        }

        System.out.println("What's your age?");
        String ageInput = sc.nextLine().trim();
        int age = 18;
        if (!ageInput.isEmpty()) {
            age = Integer.parseInt(ageInput);
        }

        System.out.println("What's your height?");
        double height = Double.parseDouble(sc.nextLine().trim().replace(",", "."));

        int yearOfBirth = 2026 - age;
        System.out.printf("%s %s is %d years old, her height is %.2f meters and she was born in %d.", name, surname, age, height, yearOfBirth);
        System.out.println();
        System.out.println();
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println((name.charAt(0)));

        System.out.println("Do you drink coffee?");
        String drinkCoffee = sc.nextLine();

        // System.out.println(drinkCoffee.equalsIgnoreCase("ja"));
        System.out.println(drinkCoffee.toLowerCase().contains("j") && drinkCoffee.length() <= 2 ? "True" : "False");

        // Initials
        System.out.println("Initials: " + name.charAt(0) + ". " + surname.charAt(0) + ".");

        // String builder
        StringBuilder reverseName = new StringBuilder(name).reverse();
        System.out.println(reverseName);
    }
}