
/**
 * Main
 */
public class Main {
    public static void main(String args[]) {
        String a = "sisfo";
        String b = new String("sisfo");
        String c = "sisfo";
        System.out.println(a.equals(b));
        // == tidak membandingkan isi atau konten sehingga hasilnya false
        System.out.println(a == b);
        System.out.println(a == c);
    }
}