public class Caesar {

    public static void main(String[] args) {

        String word = "Hallo Welt!";
        StringBuilder encrypted = new StringBuilder();

        // Verschlüsselung
        for (int i = 0; i < word.length(); i++) {

            char current = word.charAt(i);

            if (!Character.isLetter(current)) {
                encrypted.append(current);
                continue;
            }

            if (current >= 'a' && current <= 'z') {
                current = (char) ((current - 'a' + 3) % 26 + 'a');
            } else if (current >= 'A' && current <= 'Z') {
                current = (char) ((current - 'A' + 3) % 26 + 'A');
            }

            encrypted.append(current);
        }

        String secret = encrypted.toString();
        System.out.println("Verschlüsselt: " + secret);


        // Entschlüsselung
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < secret.length(); i++) {

            char current = secret.charAt(i);

            if (!Character.isLetter(current)) {
                decrypted.append(current);
                continue;
            }

            if (current >= 'a' && current <= 'z') {
                current = (char) ((current - 'a' - 3 + 26) % 26 + 'a');
            } else if (current >= 'A' && current <= 'Z') {
                current = (char) ((current - 'A' - 3 + 26) % 26 + 'A');
            }

            decrypted.append(current);
        }

        String backToNormal = decrypted.toString();

        System.out.println("Entschlüsselt: " + backToNormal);
        System.out.println("Original wiederhergestellt: " + word.equals(backToNormal));
    }
}