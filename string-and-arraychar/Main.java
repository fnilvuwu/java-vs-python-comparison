/**
 * Main
 */
public class Main {

    public static void main(String args[]) {
        String prodi = "Sistem Informasi";
        char[] prodiChar = prodi.toCharArray();
        String prodiString = new String(prodiChar);
        char charData = prodiString.charAt(0);

        System.out.println(prodi.getClass().getSimpleName());
        System.out.println(prodiChar.getClass().getSimpleName());
        System.out.println(((Object)charData).getClass().getSimpleName());
    }
}