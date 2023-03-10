/**
 * Fruit
 */
public class Fruit1 {

    String nama;
    String warna;
    int harga;

    public void warnaBuah(String warnaBuah) {
        warna = warnaBuah;
    }

    public void hargaBuah(int hargaBuah) {
        harga = hargaBuah;
    }

    public void namaBuah(String namaBuah) {
        nama = namaBuah;
    }

    public void detailBuah() {
        
        System.out.println("Nama buah : " + nama);
        System.out.println("Warna : " + warna);
        System.out.println("Harga buah : " + harga);

    }
    
}