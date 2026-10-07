package jobsheet3;
import java.util.Scanner;
public class JumlahCicilanRina {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);
        int harga, uangMuka, lamaCicilan, sisaHarga; 
        double bunga=0.02, jumlahCicilan, nilaiBunga;
        System.out.println("Masukkan harga laptop");
        harga=reyhan.nextInt();
        System.out.println("Masukkan jumlah uang muka");
        uangMuka=reyhan.nextInt();
        System.out.println("pembayaran dilakukan selama..."+"Bulan");
        lamaCicilan=reyhan.nextInt();
        sisaHarga=harga-uangMuka;
        nilaiBunga=sisaHarga*bunga;
        jumlahCicilan=sisaHarga/lamaCicilan+nilaiBunga;
        System.out.println("Jumlah cicilan setiap bulan "+jumlahCicilan);
        reyhan.close();


        
    }
}
