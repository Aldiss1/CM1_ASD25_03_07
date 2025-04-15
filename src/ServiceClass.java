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
        int count = 0;

        for (int i = 0; i < trs.length; i++) {
            if (trs[i] != null && trs[i].brg.kodeBarang.equalsIgnoreCase(cari)) {
                posisi = i;
                count++;
            }
        }

        if (count > 1) {
            System.out.println("Terdapat lebih dari satu barang yang sama!");
        }

        return posisi;
    }

    void sorting() {
        for (int i = 0; i < trs.length - 1; i++) { 
            for (int j = 0; j < trs.length - 1 - i; j++) { 
                if (trs[j].brg.kodeBarang.compareTo(trs[j + 1].brg.kodeBarang) > 0) {
                    TransaksiPembelian temp = trs[j];
                    trs[j] = trs[j + 1];
                    trs[j + 1] = temp;
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

    
}
