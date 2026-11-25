package jobsheet9;
import java.util.Scanner;
public class PemesananKafe05 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappucino",
            "Chocolate Ice"
        };

        int[] harga = {
            15000,
            13000,
            10000,
            12000,
            8000,
            18000,
            20000
        };

        
        System.out.print("Masukkan nama menu yang ingin dicari: ");
        reyhan.nextLine();
        String cariMenu = reyhan.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                System.out.println("Menu ditemukan!");
                System.out.println("Nama Menu : " + menu[i]);
                System.out.println("Harga     : Rp" + harga[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Menu \"" + cariMenu + "\" tidak tersedia.");
        }

      
        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = reyhan.nextInt();
        reyhan.nextLine();

        String[] pesanan = new String[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {

            boolean valid = false;

            while (!valid) {

                System.out.print("Masukkan pesanan ke-" + (i + 1) + ": ");
                String namaPesanan = reyhan.nextLine();

                for (int j = 0; j < menu.length; j++) {

                    if (menu[j].equalsIgnoreCase(namaPesanan)) {
                        pesanan[i] = menu[j];
                        totalBiaya += harga[j];
                        valid = true;
                        break;
                    }

                }

                if (!valid) {
                    System.out.println("Menu tidak tersedia, silakan pilih lagi.");
                }
            }
        }

       
        System.out.println("\n=================================");
        System.out.println("         STRUK PESANAN");
        System.out.println("=================================");

        for (int i = 0; i < pesanan.length; i++) {

            for (int j = 0; j < menu.length; j++) {

                if (pesanan[i].equals(menu[j])) {
                    System.out.println((i + 1) + ". "
                            + pesanan[i]
                            + " - Rp" + harga[j]);
                    break;
                }
            }
        }

        System.out.println("=================================");
        System.out.println("Total Biaya : Rp" + totalBiaya);
        System.out.println("=================================");

        reyhan.close();
    }
}
    

