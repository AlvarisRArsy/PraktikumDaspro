package jobsheet4;
import java.util.Scanner;
public class TugasParkir05 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);
        System.out.println("--- PEMBAYARAN PARKIR ---");
        System.out.println("Masukkan jam parkir: ");
        Double jamParkir = reyhan.nextDouble();
        double tarif;
        
    if (jamParkir<=2) {
        tarif= 2000;
        System.out.println("Tarif parkir Rp: " +tarif);
    }

    else {
        tarif= 2000+(jamParkir-2)*1000;
        System.out.println("Tarif parkir Rp: " +tarif);

    }
    reyhan.close();

}
}

    

