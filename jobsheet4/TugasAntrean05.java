package jobsheet4;
import java.util.Scanner;
public class TugasAntrean05 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);
        System.out.println("--- LAYANAN AKADEMIK ---");
        System.out.println("Masukkan nomor kode layanan: ");
        int kode = reyhan.nextInt();

    switch (kode) {
        case 1:
            System.out.println("Legalisir ijazah: Loket A");
            break;
        case 2:
            System.out.println("Surat Keterangan Aktif Kuliah: Loket B");
            break;
        case 3:
            System.out.println("Pembayaran UKT: Loket C");
            break;
        case 4:
            System.out.println("Pengajuan cuti akademik: Loket D");
            break;
        default:
            System.out.println("Kode layanan tidak tersedia");



    }

     reyhan.close();

    }
}

