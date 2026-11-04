package Jobsheet8;
import java.util.Scanner;
public class Triangle05 {
    public static void main(String[] args) {
       Scanner reyhan = new Scanner (System.in);
       System.out.print("Masukkan nilai n = ");
       int n = reyhan.nextInt();
       
       int i = 1;
       while (i <= n) {
        System.out.print("[i=" + i + "] ");
        int j = 0;
        while (j < i) {
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;
       }
       reyhan.close();
    }
}
