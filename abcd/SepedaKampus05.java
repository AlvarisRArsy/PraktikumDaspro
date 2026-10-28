//P=5, 
package abcd;
import java.util.Scanner;
public class SepedaKampus05 {
    public static void main(String[] args) {
        Scanner reyhan = new Scanner(System.in);
       int besaran=5, tarifPerJamBiasa=6000, tarifPerJamListrik=13000, tarifPerJamTandem=9000,bJam=5, sJam=8, lamaSewa, diskon=0.1, kode;
       double=totalDiskon, totalBayar;
       String status;

       System.out.println("apakah anda mahasiswa?");
       string status=reyhan.nextLine();

      if (status="mahasiswa") {
        switch (kode) {
            case1:

                System.out.println("Sepeda biasa");
                System.out.println("masukkan jam sewa");
                int lamaSewa=reyhan.nextInt();
                break;
                if (lamaSewa>=1&&lamaSewa<=12){
                    totalBayar=tarifPerJamBiasa*lamaSewa;

                }
                else{
                    System.out.println("inpot tidak valid");
                }
            case2:
            System.out.println("Sepeda listrik");
            System.out.println("masukkan jam sewa");
            if (lamaSewa>=1&&lamaSewa<=12){
                totalBayar=tarifPerJamListrik*lamaSewa;
            }

        
            default:
                break;
        }
        
      } else {
        
      } 
       
    }
}
