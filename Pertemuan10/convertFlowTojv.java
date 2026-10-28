package Pertemuan10;
import java.util.Scanner;
public class convertFlowTojv {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);
        int jumlahTerjual, jumlahProduk=3;
        int totalPerProduk=0, jumlahHari=4;
        int totalPenjualan= 0;
        
        for (int i = 0; i < jumlahProduk;) {
            for (int j = 0; j < jumlahHari;) {
                System.out.println("Masukkan jumlah terjual dari produk ke-" + (i+1) + " Dari hari ke-" + (j+1) );
                jumlahTerjual=reyhan.nextInt();

                totalPerProduk=jumlahTerjual;

                j++;
            }
            System.out.println("Total penjualan per produk " +totalPerProduk);
            totalPenjualan=totalPenjualan+totalPerProduk;
            totalPerProduk=0;
            i++;
        }
        System.out.println(" Total penjualan seluruh produk adalah " +totalPenjualan);
    }
}
