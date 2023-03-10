import java.util.ArrayList;

/**
 * Main
 */
public class Main {
    public static void main(String args[]) {
        // Membuat array list
        ArrayList<String> names = new ArrayList<>();
        // Menambah data kedalam array list
        names.add("Rojali");
        names.add("Eko");
        // Mengakses element arraylist
        System.out.println(names.get(0));
        // Mendapatkan panjang dari arraylist
        System.out.println(names.size());
        // Menghapus elemen arraylist indeks ke 0
        names.remove(0);
        // Menghapus semua element di array list
        names.clear();
    }
}