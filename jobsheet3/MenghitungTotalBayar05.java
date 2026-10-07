package jobsheet3;
import java.util.Scanner;
public class MenghitungTotalBayar05 {
    public static void main(String[] args) {
       Scanner reyhan =  new Scanner (System.in);
       double harga;
       double potongan;
       double jml_bayar;
       double diskon=0.15;
       System.out.println("Masukkan harga");
       harga=reyhan.nextDouble();
       potongan=diskon*harga;
       jml_bayar=harga-potongan;
       System.out.println("Jumlah yang harus anda bayar adalah Rp. "+jml_bayar);
       reyhan.close();
    }
}
