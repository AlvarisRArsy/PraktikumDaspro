package jobsheet2;
import java.util.Scanner;
public class SisatanahpakTono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lebar_tanah, panjang_tanah, sisi_taman;
        double jari_jari, luas_tanah, luas_kolam, luas_taman, total_digunakan, sisa_tanah;
        System.out.println("Masukkan lebar tanah");
        lebar_tanah= sc.nextInt();
        System.out.println("Masukkan panjang tanah");
        panjang_tanah= sc.nextInt();
        System.out.println("Masukkan Panjang Sisi Taman");
        sisi_taman= sc.nextInt();
        System.out.println("Masukkan Jari Jari kolam Ikan");
        jari_jari= sc.nextDouble();
        luas_tanah= panjang_tanah*lebar_tanah;
        luas_kolam= Math.PI*(jari_jari*jari_jari);
        luas_taman= sisi_taman*sisi_taman;
        total_digunakan= luas_kolam+luas_taman;
        sisa_tanah= luas_tanah-total_digunakan;
        System.out.println("Sisa Tanah " +sisa_tanah);
        sc.close();



        
    }
}
