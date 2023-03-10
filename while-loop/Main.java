import java.util.Scanner; // Import the Scanner class

/**
 * Main
 */
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int answer = 9;
        boolean guess = false;
        while (!guess) {
            int tryAnswer = in.nextInt();
            guess = tryAnswer == answer;
        }
        System.out.println("end");
    }
}