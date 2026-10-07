package abcd;
//depot jual air dalam satuan liter, diisi ke galon 19 liter, , sisa air disimpan di tandon, air dijual 19500, depot buka 8 jam sehari, rata2 pendapatan perjam, bilanga bulat, tampilkan jumlah galon penuh, sisa air di tandon, pendapatan, dan rata2 per jam.

import java.util.Scanner;
public class DepotAir05 {
    public static void main(String[] args) {
        Scanner reyhan= new Scanner (System.in); 
        int satuGalon=19, hargaAir=19500, sisaAir, pendapatan, jumlahGalon, jumlahAir;
        double rataRataPerJam;
        System.out.println("masukkan jumlah galon");
        jumlahGalon= reyhan.nextInt();
        pendapatan = jumlahGalon*hargaAir;
        rataRataPerJam= pendapatan/8;
        jumlahAir= satuGalon*jumlahGalon;
        System.out.println("pendapatan adalah" +pendapatan);
        System.out.println("rata2 perjam adalah" +rataRataPerJam);
        System.out.println("jumlah air diproduksi adalah" +jumlahAir);

        reyhan.close();






        
        
    }
    
}
