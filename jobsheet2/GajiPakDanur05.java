package jobsheet2;
public class GajiPakDanur05 {
    public static void main(String[] args) {
        int tunjangan_anak= 100000, jumlah_anak= 4, gaji_pokok= 5000000 ;
        double potongan_dana_pensiun =0.1, gaji_bersih, nilai_potongan, gaji_pokok_bersih;
        System.out.println("Gaji pokok adalah " +gaji_pokok);
        System.out.println("Tunjangan anak adalah " +tunjangan_anak);
        System.out.println("jumlah anak adalah " +jumlah_anak);
        System.out.println("Potongan dana adalah " +potongan_dana_pensiun);
        System.out.println((gaji_pokok_bersih= gaji_pokok-nilai_potongan));
        System.out.println((gaji_bersih= gaji_pokok_bersih+tunjangan_anak*jumlah_anak));
        System.out.println("Gaji bersih adalah " +gaji_bersih);
    }

    
}
