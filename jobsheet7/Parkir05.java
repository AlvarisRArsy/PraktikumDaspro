package jobsheet7;
import java.util.Scanner;
public class Parkir05 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);
        //P=5
        int jenis, durasi;
        int total = 0;

        do {
            System.out.println("\nJenis Kendaraan");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Masukkan nomor sesuai jenis kendaraan: ");
            jenis = reyhan.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = reyhan.nextInt();
                if (jenis==0) {
                    System.out.println("Selesai");
                    break;
                }

                if (jenis == 1) {
                    total += durasi * 3750;
                    // 2500 + (5 mod 6) × 250= 3750
                } else {
                    total += durasi * 2750;
                    // 1500 + (5 mod 6) × 250= 2750
                }
            }
            System.out.println("\nTotal pembayaran parkir = Rp" + total);

        } while (true);

    }
}
