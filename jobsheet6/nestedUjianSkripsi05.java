package jobsheet6;
import java.util.Scanner;
public class nestedUjianSkripsi05 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);
        String pesan;
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = reyhan.nextLine().trim();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = reyhan.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = reyhan.nextInt();
        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 6 && bimbinganP2 >= 5) {   //P1 6+(5mod5)=6, P2 3+(5mod3)=5
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            }else if (bimbinganP1 < 6 && bimbinganP2 < 5) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 6 kali dan P2 kurang dari 5 kali";
            } else if (bimbinganP1 < 6) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 6 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
    }   
}
