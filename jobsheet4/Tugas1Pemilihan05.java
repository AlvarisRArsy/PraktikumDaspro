package jobsheet4;
import java.util.Scanner;
public class Tugas1Pemilihan05 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah Lunas? (true/false): ");
        boolean uktLunas = reyhan.nextBoolean(); 
        String pesan;
        
    pesan =  (uktLunas) ? "Pembayaran UKT Terverivikasi," +" Silahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
    System.out.println(pesan);
    
    reyhan.close();

}
}