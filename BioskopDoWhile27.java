import java.util.Scanner;

public class BioskopDoWhile27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket, totalTiketTerjual = 0;
        double hargaTiket = 50000;
        double totalPenjualan = 0;
        char tambahLagi;

        System.out.println("===== Program Penjualan Tiket Bioskop =====");

        do {
            System.out.print("\nMasukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Jumlah tiket tidak boleh negatif.");
                continue;
            }

            double diskon = 0;
            double hargaAwal = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalBayar = hargaAwal - (hargaAwal * diskon);
            System.out.println("Total yang harus dibayar: Rp " + (int)totalBayar);

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalBayar;

            System.out.print("Apakah ada transaksi lain (y/n)? ");
            tambahLagi = sc.next().charAt(0);
            sc.nextLine();

        } while (tambahLagi == 'y' || tambahLagi == 'Y');

        System.out.println("\n===== Rekapitulasi Penjualan Harian =====");
        System.out.println("Total tiket yang terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan hari ini: Rp " + (int)totalPenjualan);
        System.out.println("=========================================");
    }
}