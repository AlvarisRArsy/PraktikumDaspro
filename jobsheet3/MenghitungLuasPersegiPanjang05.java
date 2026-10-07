package jobsheet3;
import java.util.Scanner;
public class MenghitungLuasPersegiPanjang05 {
    public static void main(String[] args) {
      java.util.Scanner reyhan = new Scanner (System.in);
      int panjang;
      int lebar;
      int luas;
      System.out.println("Masukkan panjang");
      panjang=reyhan.nextInt();
      System.out.println("Masukkan lebar");
      lebar=reyhan.nextInt();
      luas=panjang*lebar;
      System.out.println("Luas persegi adalah " +luas);
      reyhan.close();

    }
}
