package jobsheet7;
import java.util.Scanner;
public class totalPejTiket05 {
    public static void main(String[] args) {
        Scanner reyhan=new Scanner (System.in);
        //P=5
        int totalTiket=0, totalPenjualan=0, hargaTiket=50000, jumlahPelanggan;
        // 40000 + (5 mod 6) × 2000=50000
        System.out.print("Masukkan jumlah pelanggan: ");
        jumlahPelanggan = reyhan.nextInt();
        int i = 1;
        while (i <= jumlahPelanggan) {
            System.out.print("Jumlah tiket pelanggan ke-" + i + ": ");
            int tiket = reyhan.nextInt();
            if (tiket < 0) {
                System.out.println("Jumlah tidak valid! Masukkan ulang.");
                continue;
            }
            double totalHarga = tiket * hargaTiket;
            if (tiket > 9) {
                totalHarga -= totalHarga * 0.16;
                // (8 + (5 mod 4))=9 tiket, dengan diskon (15 + (P mod 4))=16%/0.16 
            } else if (tiket > 5) {
                totalHarga -= totalHarga * 0.08;
                // (3 + (5 mod 3)) =5tiket, dengan diskon (8 + (5 mod 5))=8%/0.08 
            }
            totalTiket += tiket;
            totalPenjualan += totalHarga;
            i++;
        }
        System.out.println("\n=== LAPORAN PENJUALAN ===");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp " + totalPenjualan);
        reyhan.close();
    }
            
        
    }

