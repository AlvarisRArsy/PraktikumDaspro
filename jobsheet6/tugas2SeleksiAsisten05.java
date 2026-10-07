package jobsheet6;
import java.util.Scanner;
public class tugas2SeleksiAsisten05  {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        boolean mahasiswaAktif = reyhan.nextBoolean();

        System.out.print("Apakah sedang disanksi? (true/false): ");
        boolean sedangDisanksi = reyhan.nextBoolean();

        System.out.print("Masukkan nilai Dasar Pemrograman: ");
        int nilaiDP = reyhan.nextInt();

        System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
        boolean punyaSertifikat = reyhan.nextBoolean();

        System.out.print("Masukkan nilai wawancara: ");
        int nilaiWawancara = reyhan.nextInt();

        int P = 5;
        int syaratDP = 75 + (P % 11);        
        int syaratWawancara = 70 + (P % 11); 

        if (mahasiswaAktif && !sedangDisanksi) {
            if (nilaiDP >= syaratDP || punyaSertifikat) {
                System.out.println("Lolos tahap nilai/sertifikat → Dipanggil wawancara");
                if (nilaiWawancara >= syaratWawancara) {
                    System.out.println("Selamat! Anda diterima sebagai asisten praktikum.");
                } else {
                    System.out.println("Gagal: Nilai wawancara kurang dari " + syaratWawancara);
                }
            } else {
                System.out.println("Gagal: Nilai Dasar Pemrograman kurang dari " + syaratDP + " dan tidak memiliki sertifikat.");
            }
        } else {
            System.out.println("Gagal: Mahasiswa tidak aktif atau sedang disanksi.");
        }
    }
}
