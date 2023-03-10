/**
 * Main
 */
public class Main {

    public static void main(String args[]) {
        // String.format()
        // menampilkan dua angka dibelakang koma
        String result = String.format("%.2f", 3.12412);
        System.out.println(result);
        // printf()
        // menampilkan satu angka dibelakang koma, dan tanpa baris baru
        System.out.printf("%.1f", 3.123123);
    }
}