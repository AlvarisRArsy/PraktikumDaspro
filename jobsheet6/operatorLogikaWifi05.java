package jobsheet6;
import java.util.Scanner;
public class operatorLogikaWifi05 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);
        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;
        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = reyhan.nextBoolean();

        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = reyhan.nextBoolean();

        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = reyhan.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses WIFI diberikan");
        } else {
            System.out.println("Akses WIFI ditolak");
            
        }

    }
}
