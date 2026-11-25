package jobsheet9;
import java.util.Arrays;

public class ArrayBilangan05 {
    public static void main(String[] args) {
        //P=5
    int[] bil = {5, 13, -6, 25};

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));
    }
    
}
