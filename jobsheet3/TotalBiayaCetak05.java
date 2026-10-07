package jobsheet3;
import java.util.Scanner;
public class TotalBiayaCetak05 {
    public static void main(String[] args) {
        java.util.Scanner reyhan = new Scanner (System.in);
        int banyakLembar, biayaCetak=500, biayaJilid= 5000, totalBiaya;
        System.out.println("masukkan banyak lembar");
        banyakLembar=reyhan.nextInt();
        totalBiaya=banyakLembar*biayaCetak+biayaJilid;
        System.out.println("Total biaya cetak adalah "+totalBiaya);
        reyhan.close();
        
    }
}
