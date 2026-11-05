package Jobsheet8;
import java.util.Scanner;
public class Tugas305 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner(System.in);

       
  System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = reyhan.nextInt();

        int[] pelangganToko = new int[jumlahToko];
        int[] barangToko = new int[jumlahToko];

        int totalBarangSemuaToko = 0;
        int tokoTerbanyak = 1;
        int barangTerbanyak = 0;

        for (int i = 0; i < jumlahToko; i++) {

            System.out.println("\nToko " + (i + 1));

            System.out.print("Masukkan jumlah pelanggan toko " + (i + 1) + ": ");
            pelangganToko[i] = reyhan.nextInt();

            int totalBarangToko = 0;

            for (int j = 1; j <= pelangganToko[i]; j++) {
                System.out.print("Jumlah barang pelanggan ke-" + j + ": ");
                int jumlahBarang = reyhan.nextInt();

                totalBarangToko += jumlahBarang;
            }

            barangToko[i] = totalBarangToko;
            totalBarangSemuaToko += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i + 1;
            }
        }

        System.out.println(" ");

        for (int i = 0; i < jumlahToko; i++) {
            System.out.println(
                "Toko " + (i + 1)
                + " - pelanggan: " + pelangganToko[i]
                + ", total barang: " + barangToko[i]
            );
        }

        System.out.println("Total barang seluruh toko: " + totalBarangSemuaToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        reyhan.close();
    }
}
