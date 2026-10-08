package jobsheet7;
import java.util.Scanner;
public class StudiKasus205 {
    public static void main(String[] args) {
        Scanner reyhan= new Scanner (System.in);
        String nama, jeniskegiatan;
        int jumlahDokumen, peringkatJuara, statuspendanaan;

        System.out.println("Masukkan nama:");
        nama=reyhan.nextLine();
        System.out.println("Masukkkan jenis kegiatan(BELMAWA/BAKORMA/Mandiri/PKM/LAINNYA): ");
        jeniskegiatan=reyhan.nextLine();
        System.out.println("Masukkan jumlah dokumen yang anda upload:");
        jumlahDokumen=reyhan.nextInt();
        System.out.println("Masukkan peringkat juara anda:");
        peringkatJuara=reyhan.nextInt();
        System.out.println("Masukkan status pendanaan anda (1=lolos, 0=tidak lolos) ");
        statuspendanaan=reyhan.nextInt();
        System.out.println("Nama Mahasiswa : " +nama);
        System.out.println("jenis kegiatan(BELMAWA/BAKORMA/Mandiri/PKM/LAINNYA) : " +jeniskegiatan);
        System.out.println("Jumlah dokumen : " +jumlahDokumen);
        System.out.println("peringkat juara: " +peringkatJuara);

        if (jeniskegiatan.equalsIgnoreCase("BAKORMA")||jeniskegiatan.equalsIgnoreCase("BELMAWA")||jeniskegiatan.equalsIgnoreCase("Mandiri")) {
            if (peringkatJuara>=1&&peringkatJuara<4) {
                if (jumlahDokumen==4) {
                    System.out.println("Status: Dokumen lengkap, Dana penghargaan akan diberikan");
                } else if (jumlahDokumen==3) {
                    System.out.println("Status: Dokumen tidak lengkap (kurang  1 dokumen). Dana penghargaan tidak diberikan.");
                } else if (jumlahDokumen==2) {
                    System.out.println("Status: Dokumen tidak lengkap (kurang  2 dokumen). Dana penghargaan tidak diberikan.");
                } else if (jumlahDokumen==1) {
                    System.out.println("Status: Dokumen tidak lengkap (kurang  3 dokumen). Dana penghargaan tidak diberikan.");
                } else if (jumlahDokumen==0) {
                    System.out.println("Status: Dokumen tidak lengkap (kurang  4 dokumen). Dana penghargaan tidak diberikan.");
                } else {
                    System.out.println("Status: Jumlah Dokumen tidak valid.");
                    
                }
                    
            } else {
                System.out.println("Status: Peringkat juara harus 1, 2, dan 3, selain itu tidak diberikan dana penghargaan.");
            }
            
        } else {
            
        }
    }
    
}
