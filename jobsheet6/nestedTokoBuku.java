package jobsheet6;
import java.util.Scanner;
public class nestedTokoBuku {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);
        
        System.out.print("Masukkan jenis buku (kamus/novel/lain): ");
        String jenis = reyhan.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        int jumlah = reyhan.nextInt();

        System.out.print("Masukkan harga per buku: ");
        double harga = reyhan.nextDouble();

        int P = 5;
        double diskon = 0;

        if (jenis.equalsIgnoreCase("kamus")) {
            diskon = 8 + (P % 5); 
            if (jumlah > (2 + (P % 2))) {
                diskon += 2; 
            }
        } else if (jenis.equalsIgnoreCase("novel")) {
            diskon = 5 + (P % 4); 
            if (jumlah > (3 + (P % 2))) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        } else { 
            if (jumlah > (3 + (P % 2))) {
                diskon = 3 + (P % 4);
            } else {
                diskon = 0;
            }
        }
        double total = harga * jumlah;
        double potongan = total * (diskon / 100);
        double totalBayar = total - potongan;

        System.out.println("\n===== Struk Diskon Toko Buku =====");
        System.out.println("Jenis Buku   : " + jenis);
        System.out.println("Jumlah Buku  : " + jumlah);
        System.out.println("Harga Satuan : Rp " + harga);
        System.out.println("Total Harga  : Rp " + total);
        System.out.println("Diskon       : " + diskon + "%");
        System.out.println("Potongan     : Rp " + potongan);
        System.out.println("Total Bayar  : Rp " + totalBayar);

    }
}
