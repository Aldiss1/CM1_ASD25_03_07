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

        while (true) {
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
                
            }
        }
    }
}
