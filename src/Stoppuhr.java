public class Stoppuhr {
    static void main(String[] args) {
        int runden = 200_000;

        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < runden; i++) {
            s += "!";
        }
        System.out.println("+=            : " + (System.nanoTime() - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < runden; i++) {
            sb.append("!");
        }
        String fertig = sb.toString();
        System.out.println("StringBuilder : " + (System.nanoTime() - start) / 1_000_000 + " ms");
        System.out.println(s.length() + " und " + fertig.length() + " Zeichen");
    }
}