package jobsheet4;
import java.util.Scanner;
public class Pemilihanif05 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah Lunas? (true/false): ");
        boolean uktLunas = reyhan.nextBoolean(); 
        
    if (uktLunas) {
        System.out.println("Pembayaran UKT Terverivikasi");
        System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
    }

    else {
        System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");

    }
    reyhan.close();


    }

    
}
