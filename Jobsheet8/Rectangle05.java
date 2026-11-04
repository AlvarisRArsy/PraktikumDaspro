package Jobsheet8;
import java.util.Scanner;
public class Rectangle05 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = reyhan.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = reyhan.nextInt();

        for (int i = 1; i <= kolom; i++) {
            for (int j = 1; j <= baris; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        reyhan.close();
    }
}
