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
        System.out.println("Kode Barang : " + this.kodeBarang);
        System.out.println("Nama Barang : " + this.nama);
        System.out.println("Kategori Barang : " + this.kategori);
        System.out.println("Stok Barang : " + this.stok);
        System.out.println("Harga Barang : " + this.harga);
    }
}