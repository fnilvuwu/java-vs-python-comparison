class Fruit1:

    def warnaBuah(warnaBuah):
        global warna
        warna = warnaBuah

    def namaBuah(namaBuah):
        global nama
        nama = namaBuah

    def hargaBuah(hargaBuah):
        global harga
        harga = hargaBuah

    def detailBuah():
        print("Nama buah : " + nama)
        print("Warna : " + warna)
        print("Harga buah : " + str(harga))
