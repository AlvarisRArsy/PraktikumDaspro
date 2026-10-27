//P=5
package jobsheet7;
import java.util.Scanner;
public class SiakadFor05 {
    public static void main(String[] args) {
        Scanner reyhan= new Scanner (System.in);
        double nilai, tertinggi=0, terendah=100;
        int lulus=0, tidakLulus=0;

        for (int i = 1; i <= 8; i++) {
            //8+(5mod5)=8
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai=reyhan.nextDouble();

            if (nilai >= 60) {
                //55+(5mod11)=60
                lulus++;
            } else {
                tidakLulus++;
            }
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            
        }
        System.out.println( "Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus : " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + tidakLulus);   
        
    }
}
