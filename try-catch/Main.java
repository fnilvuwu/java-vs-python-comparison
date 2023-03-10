
/**
 * Main
 */
public class Main {
    public static void main(String args[]) {
        try {
            // tidak bisa membagi dengan 0
            int result = 10 / 0;
            // exception akan diassign ke variabel e
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("end");
        }
    }
}