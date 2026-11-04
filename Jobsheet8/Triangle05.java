package Jobsheet8;
import java.util.Scanner;
public class Triangle05 {
    public static void main(String[] args) {
        //n = (2 + (5 mod 3)) 
       Scanner reyhan = new Scanner (System.in);
       System.out.print("Masukkan nilai n = ");
       int n = reyhan.nextInt();
       
       int i = 0;
       while (i <= n) {
        System.out.print("[i=" + i + "] ");
        int j = 0;
        while (j < i) {
            System.out.print("*");
            j++;
        }
        i++;
       }
       reyhan.close();
    }
}
