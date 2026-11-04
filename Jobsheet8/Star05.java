package Jobsheet8;
import java.util.Scanner;
public class Star05 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);
        System.out.print("Masukkan nilai n  =" );
        int n = reyhan.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        reyhan.close();
    }
    
}
