package jobsheet9;
import java.util.Scanner;
public class ArrayNilai05 {
    public static void main(String[] args) {
        int[] nilaiAkhir=new int[10];
        Scanner reyhan=new Scanner (System.in);
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;


        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i]=reyhan.nextInt();
        }
        System.out.println("\nHasil Kelulusan:");

        for (int nilai : nilaiAkhir) {
            if (nilai > 70) {
                System.out.println(nilai + " (LULUS)");
                jumlahLulus++;
            } else {
                System.out.println(nilai + " (TIDAK LULUS)");
                jumlahTidakLulus++;
            }
        }

        System.out.println("\nJumlah mahasiswa lulus        : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + jumlahTidakLulus);

        reyhan.close();
           
        

        
    }
    
}
