 
package abcd;
import java.util.Scanner;
public class remedKuis105 {
    public static void main(String[] args) {
        Scanner reyhan =new Scanner (System.in);
        int beratLebih, biayaLebih, totalTagihan;
        String nama;

        System.out.println("Silahkan masukkan nama: " );
        nama=reyhan.nextLine();
        System.out.println("Masukkan berat lebihan dari paket 10kg (hanya angka,tidak boleh negatif): ");
        beratLebih=reyhan.nextInt();
        totalTagihan=70000+beratLebih*6000+2500*(10+beratLebih);
        biayaLebih=totalTagihan-95000;
        System.out.println("Nama pelanggan: " + nama);
        System.out.println("berat lebih dari 10kg: " + beratLebih);
        System.out.println("biaya berat tambahan:" +biayaLebih);
        System.out.println("Total tagihan: " + totalTagihan);        
    }
}
//output=
// Silahkan masukkan nama: 
//Alvaris Reyhan
//Masukkan berat lebihan dari paket 10kg (hanya angka,tidak boleh negatif): 
//7
//Nama pelanggan: Alvaris Reyhan
//berat lebih dari 10kg: 7
//biaya berat tambahan:59500
//Total tagihan: 154500