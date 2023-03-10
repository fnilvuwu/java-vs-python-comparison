
/**
 * Main
 */
public class Main {
    public static void main(String args[]) {
        System.out.println(sum(3, 9));
        System.out.println(sum(3, 9, 10, 5));
        System.out.println(sum(3.1, 9.2, 7.1, 3.5));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int... nums) {
        int result = 0;
        for (int n : nums) {
            result += n;
        }
        return result;
    }

    public static double sum(double... nums) {
        double result = 0;
        for (double n : nums) {
            result += n;
        }
        return result;
    }
}