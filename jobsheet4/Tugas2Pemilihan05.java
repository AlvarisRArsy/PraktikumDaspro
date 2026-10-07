package jobsheet4;
import java.util.Scanner;
public class Tugas2Pemilihan05 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);
        System.out.println("--- CEK VALIDASI KRS ---");
        System.out.println("Masukkan JUMLAH SKS: ");
        int jumlahSks = reyhan.nextInt(); 
        
    if (jumlahSks >24) {
        System.out.println("Melebihi batas");

    }

    else {
        System.out.println("KRS valid");

    }
    reyhan.close();

}
}
