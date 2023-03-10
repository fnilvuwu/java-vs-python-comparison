
/**
 * Main
 */
public class Main {
    public static void main(String args[]) {
        System.out.println(factorial(8));
    }

    // method rekursif
    public static int factorial(int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}