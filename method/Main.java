
/**
 * Main
 */
public class Main {
    public static void main(String args[]) {
        int[] ages = { 19, 20, 25 };
        String name = "john";
        int age = 24;
        // memanggil method
        printHello(name, age);
        System.out.println(isAgeExist(ages, age));
    }

    // deklarasi method void
    public static void printHello(String name, int age) {
        System.out.println("Hello I'm " + name);
        System.out.println("I'm " + age + "years old.");
    }

    // deklarasi method dengan return value
    public static boolean isAgeExist(int[] arr, int find) {
        for (int element : arr) {
            if (element == find) {
                return true;
            }
        }
        return false;
    }
}