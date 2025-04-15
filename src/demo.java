import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        barang[] listBarang = new barang[5];

        listBarang[0] = new barang("Br001", "Leo Kripik", "Makanan", 10, 1000);
        listBarang[1] = new barang("Br002", "You C1000 Botol", "Minuman", 10, 7000);
        listBarang[2] = new barang("Br003", "Teh Pucuk Botol", "Minuman", 10, 4000);
        listBarang[3] = new barang("Br004", "Rinso Cair", "Sabun", 10, 7000);
        listBarang[4] = new barang("Br005", "Mama Lemon Cair", "Sabun", 10, 1000);

        TransaksiPembelian[] listTransaksi = new TransaksiPembelian[5];

        listTransaksi[0] = new TransaksiPembelian("Tr001", "Santi", "21-04-2024", 1, listBarang[0]);
        listTransaksi[1] = new TransaksiPembelian("Tr002", "Vani", "21-04-2024", 2, listBarang[1]);
        listTransaksi[2] = new TransaksiPembelian("Tr003", "Siska", "23-04-2024", 3, listBarang[2]);
        listTransaksi[3] = new TransaksiPembelian("Tr004", "MeiMei", "23-04-2024", 1, listBarang[3]);
        listTransaksi[4] = new TransaksiPembelian("Tr005", "Ihsan", "24-04-2024", 1, listBarang[4]);

        ServiceClass list = new ServiceClass();

        list.tambahDataTransaksi(listTransaksi[0]);
        list.tambahDataTransaksi(listTransaksi[1]);
        list.tambahDataTransaksi(listTransaksi[2]);
        list.tambahDataTransaksi(listTransaksi[3]);
        list.tambahDataTransaksi(listTransaksi[4]);

        while (true) {
            System.out.println();
            System.out.println("================== Toko Manasuka ==================");
            System.out.println("BANK MENU:");
            System.out.println("1. Data Barang");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Pencarian Data");
            System.out.println("4. Pengurutan Data");
            System.out.println("5. Exit");
            System.out.print("Choose Menu(1-5): ");
            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.println();
                System.out.printf("%-15s %-15s  %-15s %-15s %-15s\n", "Kode Barang", "Nama barang", "Kategori", "Stock","Harga");
                for (int i = 0; i < listBarang.length; i++) {
                    listBarang[i].tampilDataBarang();
                }
            } else if (menu == 2) {
                System.out.println();
                System.out.printf("%-15s %-15s %-15s   %-15s %-15s %-15s\n", "Kode Transaksi", "Nama Pembeli", "Tanggal Pembelian", "Nama Barang", "Kuantitas", "Harga");
                for (int i = 0; i < listBarang.length; i++) {
                    listTransaksi[i].tampilDataTransaksi();
                }
            } else if (menu == 3) {
                System.out.println();
                System.out.print("Masukkan Kode Barang yang ingin dicari: ");
                sc.nextLine();
                String cari = sc.nextLine();
                System.out.println();
                int posisi = list.searching(cari);
                list.tampilDataPosisi(posisi);
            }
        }
    }
}
