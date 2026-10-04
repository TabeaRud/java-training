public class Rekursion {
    static void main() {
        long fakultät = fakultaet(2);
        System.out.println(fakultät);
    }

    static long fakultaet(int n) {
        if (n == 0) {
            return 1;
        }
        return Math.multiplyExact(n, fakultaet(n - 1));
    }
}
