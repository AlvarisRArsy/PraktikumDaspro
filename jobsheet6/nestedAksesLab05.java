package jobsheet6;
import java.util.Scanner;
public class nestedAksesLab05 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah anda mahasiswa aktif? (true/false): ");
        mahasiswaAktif = reyhan.nextBoolean();

        System.out.print("Apakah mahasiswa sedang disanksi? (true/false): ");
        sedangDisanksi = reyhan.nextBoolean();

        System.out.print("Apakah punya izin dosen? (true/false): ");
        punyaIzinDosen = reyhan.nextBoolean();

        System.out.print("Apakah anda asisten lab? (true/false): ");
        asistenLab = reyhan.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab)  {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }  
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }

    }
}
