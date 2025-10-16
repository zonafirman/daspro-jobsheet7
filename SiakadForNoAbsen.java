import java.util.Scanner;

public class SiakadForNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;

        System.out.println("===== Program Mencari Nilai Tertinggi & Terendah =====");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            if (nilai < terendah) {
                terendah = nilai;
            }
        }

        System.out.println("=====================================================");
        System.out.println("Nilai tertinggi yang ditemukan: " + tertinggi);
        System.out.println("Nilai terendah yang ditemukan: " + terendah);
        System.out.println("=====================================================");
    }
}