import java.util.HashMap;

class Main {
    public static void main(String args[]) {
        // Membuat HashMap <key, value>
        HashMap<String, Integer> scores = new HashMap<>();
        // menambah data
        scores.put("Abdul", 87);
        scores.put("Yoyo", 89);
        // Mengakses elemen
        System.out.println(scores.get("Abdul"));
        // Menghapus
        scores.remove("Yoyo");
        // Merubah nilai
        scores.replace("Abdul", 89);
        System.out.println(scores.get("Abdul"));

    }
}