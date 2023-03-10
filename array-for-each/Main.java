/**
 * Main
 */
public class Main {

    public static void main(String args[]) {
        int[] numbers = { 1, 5, 2 };
        // dengan perulangan biasa
        for (int i = 0; i < numbers.length; i++) {
            // numbers[0]
            System.out.println(numbers[i]);
        }
        // menggunakan for each
        for (int x : numbers) {
            System.out.println(x);
        }
    }
}