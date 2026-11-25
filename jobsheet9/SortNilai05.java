package jobsheet9;
import java.util.Arrays;
public class SortNilai05 {
    public static void main(String[] args) {
        int[] nilai = {25, 40, 17, 55, 5, 30}; 
        //  {B, B+15, B−8, B+30, B−20, B+5} dengan B = 20 + (Pmod60), P=5
       for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {

                if (nilai[j] < nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(nilai));
    }
}