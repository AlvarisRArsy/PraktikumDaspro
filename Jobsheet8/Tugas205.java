package Jobsheet8;
import java.util.Scanner;
public class Tugas205 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = reyhan.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal 3!");
        } else {
            int total = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int hasil = i * j;
                    total += hasil;

                    System.out.printf("%4d", hasil);
                }
                System.out.println();
            }

            System.out.println("\nJumlah seluruh angka pada tabel = " + total);
        }

        reyhan.close();
    }
    
}
