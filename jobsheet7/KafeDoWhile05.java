package jobsheet7;
import java.util.Scanner;
public class KafeDoWhile05 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);
        //P=5
        int kopi, teh, roti;
        int hargaKopi=10000, hargaTeh=6000, hargaRoti=20000;
        //kopi=10000+(5mod5)x1000=10000, teh=5000+(5mod4)x1000=6===,vroti=15000+(5mod6)x1000=20000
        String namaPelanggan;
        double totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan=reyhan.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi=reyhan.nextInt();
            System.out.print("Jumlah teh: ");
            teh=reyhan.nextInt();
            System.out.print("Jumlah roti: ");
            roti=reyhan.nextInt();
            totalHarga=(kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            reyhan.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");

    }
}
