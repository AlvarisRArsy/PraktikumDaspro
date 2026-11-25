package jobsheet9;
import java.util.Scanner;
public class SearchNilai05 {
    public static void main(String[] args) {
    Scanner reyhan = new Scanner(System.in);


        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = reyhan.nextInt();

       
        int[] nilai = new int[jumlahElemen];

        
        System.out.println("\nMasukkan elemen array:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai indeks ke-" + i + ": ");
            nilai[i] = reyhan.nextInt();
        }

       
        System.out.print("\nMasukkan nilai yang ingin dicari: ");
        int key = reyhan.nextInt();

        boolean ditemukan = false;

      
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key
                        + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai yang dicari (" + key
                    + ") tidak ditemukan dalam array.");
            System.out.println("Data yang Anda cari tidak ada pada elemen array yang telah dimasukkan.");
        }

        reyhan.close();
    }
}