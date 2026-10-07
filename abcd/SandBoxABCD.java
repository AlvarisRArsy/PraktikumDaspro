package abcd;
import java.util.Scanner;
public class SandBoxABCD {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner(System.in);
        System.out.println("Masukkan Nama ba\n\t\"rang");
        String namaBarang= reyhan.nextLine();

        System.out.print("Masukkan harga barang: Rp ");
        double harga=reyhan.nextDouble();

        System.out.println("Masukkan Jumlah Barang: ");
        int jumlahBarang= reyhan.nextInt();

        System.out.println("Masukkan Diskon (%): ");
        double diskon= reyhan.nextDouble();

        double nilaiDiskon= harga*(diskon/100);
        double hargaPostDiskon= harga-nilaiDiskon;
        double totalHarga= hargaPostDiskon*jumlahBarang;

        System.out.println(namaBarang);
        System.out.println("Total (Rp); "+totalHarga);
        reyhan.close();


    }
}
