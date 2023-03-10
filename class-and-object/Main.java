/**
 * Main
 */
public class Main {
    // permisalan sekolah dan kelas
    public static void main(String[] args) {
        Fruit objekBuah = new Fruit();
        objekBuah.cetakNama("Pisang");
        objekBuah.cetakNama("Apel");


        Fruit1 objekBuah1 = new Fruit1();
        objekBuah1.namaBuah("Apel");
        objekBuah1.warnaBuah("Merah");
        objekBuah1.hargaBuah(10000);
        objekBuah1.detailBuah();
    }
}