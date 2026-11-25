package jobsheet9;
import java.util.Scanner;
public class PengelolaNilaiMhs05 {
    public static void main(String[] args) {
        
         Scanner reyhan = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlahNilai = reyhan.nextInt();

        int[] nilai = new int[jumlahNilai];

        int total = 0;

        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = reyhan.nextInt();
            total += nilai[i];
        }

       
        double rataRata = (double) total / nilai.length;

        
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        
        System.out.println("\n===== DATA NILAI MAHASISWA =====");

        for (int i = 0; i < nilai.length; i++) {

            String status;

            if (nilai[i] > 70) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS";
            }

            System.out.println("Mahasiswa ke-" + (i + 1)
                    + " : " + nilai[i]
                    + " (" + status + ")");
        }

        System.out.println("\n===== HASIL PERHITUNGAN =====");
        System.out.println("Total Nilai      : " + total);
        System.out.println("Rata-rata Nilai  : " + rataRata);
        System.out.println("Nilai Tertinggi  : " + tertinggi);
        System.out.println("Nilai Terendah   : " + terendah);

        reyhan.close();
    }
}

    

