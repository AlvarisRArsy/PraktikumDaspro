package Jobsheet8;
import java.util.Scanner;
public class Star05 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner (System.in);
        System.out.print("Masukkan nilai n  =" );
        int n = reyhan.nextInt();

        for (int i = 2; i <= n; i +=2 ) {
            System.out.print(i + "");
        }
        System.out.println();
        reyhan.close();
    }
    
}
