public class barang {
    String kodeBarang;
    String nama;
    String kategori;
    int stok;
    int harga;

    barang(String kodeBarang, String nama, String kategori, int stok, int harga) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        this.stok = stok;
        this.harga = harga;
    }

    void tampilDataBarang (){
        System.out.printf("%-15s %-15s  %-15s  %-15d %-15d\n", kodeBarang, nama, kategori, stok, harga);
    }
}