package jobsheet7;
import java.util.Scanner;
public class StudiKasus105 {
    public static void main(String[] args) {
        Scanner reyhan= new Scanner (System.in);
        int hargaPerCup = 18000,jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.println("Masukkan Jumlah Cup: ");
        jumlahCup=reyhan.nextInt();
        System.out.println("Masukkan Jumlah uang Pembayaran: ");
        uangBayar=reyhan.nextInt();

        totalHarga = jumlahCup*hargaPerCup;

        if (totalHarga>=100000) {
            diskon=totalHarga*10/100;
            totalBayar=totalHarga-diskon;
        } else {
            diskon=0;
            totalBayar=totalHarga-diskon; 
        }

        System.out.println("Total harga : " +totalHarga);
        System.out.println("Diskon: " +diskon);
        System.out.println("Total Bayar: " +totalBayar);

        if (uangBayar>=totalBayar) {
            kembalian=uangBayar-totalBayar;
            System.out.println("Kembalian: " +kembalian);
        } else {
            kurang=totalBayar-uangBayar;
            System.out.println("Uang tidak cukup, kurang: Rp " +kurang);
        }








    }
    
}
