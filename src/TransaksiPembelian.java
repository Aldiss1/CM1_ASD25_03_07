public class TransaksiPembelian {

    String kodeTransaksi;
    String namaPembeli;
    String tanggalPembelian;
    int qty;
    barang brg;

    TransaksiPembelian(String kodeTransaksi, String namaPembeli, String tanggalPembelian, int qty, barang brg) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPembeli = namaPembeli;
        this.tanggalPembelian = tanggalPembelian;
        this.qty = qty;
        this.brg = brg;
    }

    void tampilDataTransaksi() {
        System.out.printf("%-15s %-15s    %-15s  %-15s     %-12d%-15d\n", kodeTransaksi, namaPembeli, tanggalPembelian, brg.nama, qty, brg.harga);
    }
}