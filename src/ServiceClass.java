public class ServiceClass {

    TransaksiPembelian[] trs = new TransaksiPembelian[5];
    int index;

    void tambahDataTransaksi(TransaksiPembelian trP) {
        int count = 0;
        if ((count + 1) < trs.length) {
            trs[index] = trP;
            index++;
            count += index;
        } else {
            System.out.println();
            System.out.println("DATA SUDAH PENUH");
        }
    }

    int searching(String cari) {
        int posisi = -1;

        for (int i = 0; i < trs.length; i++) {
            if (trs[i] != null && trs[i].brg.kodeBarang.equalsIgnoreCase(cari)) {
                posisi = i;
            }
        }

        return posisi;
    }

    public void sorting(barang[] listBarang) {
        for (int i = 0; i < listBarang.length - 1; i++) {
            for (int j = 0; j < listBarang.length - 1 - i; j++) {
                if (listBarang[j].kodeBarang.compareTo(listBarang[j + 1].kodeBarang) < 0) {
                    barang temp = listBarang[j];
                    listBarang[j] = listBarang[j + 1];
                    listBarang[j + 1] = temp;
                }
            }
        }
    }

    void tampilDataTransaksi() {
        for (int i = 0; i < trs.length; i++) {
            if (trs[i] != null) {
                trs[i].tampilDataTransaksi();
            }
        }
    }

    void tampilDataPosisi(int pcc) {
        if (pcc != -1) {
            System.out.println("=====DATA BARANG=====");
            System.out.printf("%-15s %-15s  %-15s %-15s %-15s\n", "Kode Barang", "Nama barang", "Kategori", "Stock",
                    "Harga");
            System.out.printf("%-15s %-15s  %-15s  %-15d %-15d\n", trs[pcc].brg.kodeBarang, trs[pcc].brg.nama,
                    trs[pcc].brg.kategori, trs[pcc].brg.stok, trs[pcc].brg.harga);

            System.out.println();
            System.out.println("=====DATA TRANSAKSI=====");
            System.out.printf("%-15s %-15s %-15s   %-15s %-15s %-15s\n", "Kode Transaksi", "Nama Pembeli",
                    "Tanggal Pembelian", "Nama Barang", "Kuantitas", "Harga");
            System.out.printf("%-15s    %-15s%-15s   %-15s    %-12s %-15s\n", trs[pcc].kodeTransaksi,
                    trs[pcc].namaPembeli, trs[pcc].tanggalPembelian, trs[pcc].brg.nama, trs[pcc].qty,
                    trs[pcc].brg.harga);

        } else {
            System.out.println("DATA TIDAK DITEMUKAN!");
        }
    }
}
