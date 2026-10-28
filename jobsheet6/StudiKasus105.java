package jobsheet6;
import java.util.Scanner;
public class StudiKasus105 {
    public static void main(String[] args) {
        Scanner reyhan= new Scanner (System.in);
        int hargaPerCup = 20000,jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
        //hargaPerCup=15000+(5mod6)x1000=20000
        System.out.println("Masukkan Jumlah Cup: ");
        jumlahCup=reyhan.nextInt();
        System.out.println("Masukkan Jumlah uang Pembayaran: ");
        uangBayar=reyhan.nextInt();

        totalHarga = jumlahCup*hargaPerCup;

        if (totalHarga>=80000) {
            //totalHarga>=80000+(5mod5)x10000=80000
            diskon=totalHarga*10/100;
            //diskon=5+(5mod6)=10%
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
