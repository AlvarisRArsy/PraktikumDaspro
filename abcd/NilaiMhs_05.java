
package abcd;
import java.util.Scanner;
public class NilaiMhs_05 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);

        System.out.println("Masukkan nama mahasiswa: ");
        String nama = reyhan.next();
        System.out.println("Masukkan nilai kuis: ");
        int nilaiKuis= reyhan.nextInt();
        System.out.println("Masukkan nlai UTS: ");
        int nilaiUts=reyhan.nextInt();
        System.out.println("Masukkan nilai UAS: ");
        int nilaiUas= reyhan.nextInt();
        System.out.println("Masukkan nilai tugas 1: ");
        int nilaiT = reyhan.nextInt();
        System.out.println("Masukkan nilai Tugas 2:");
        nilaiT = reyhan.nextInt();

        int NilaiA;
           
    
        for (int i = 0; i < 0 || i > 100; i++) {

            if (nilaiT <0 || nilaiT >100) {
                System.out.print("Nilai tidak valid, ulangi! ");
                continue;
            }
             int rataNilai;
            NilaiA = (nilaiKuis*0.3)+(nilaiUts*0.15)+(nilaiUas*0.3)+(nilaiT*20%)
            

            int jumlahMhs = 0;

            for (int j = 1; j <= jumlahMhs; j++) {
                System.out.print("Nilai Mahasiswa ke-" + j + ": ");
                int jumlahMhs = reyhan.nextInt();

        }

        System.out.println(" ");

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println(
                
            );
        }

    
        System.out.println("Jumlah MAhasiswa " + jumlahMhs);
        System.out.println("Jumlah lulus: " + Lulus);

        reyhan.close();
    }
}
