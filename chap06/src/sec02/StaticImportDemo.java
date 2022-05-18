package sec02;

import java.util.Calendar;
//import static java.util.Calendar.JANUARY;
//import static java.util.Calendar.getInstance;
import static java.util.Arrays.sort;

public class StaticImportDemo {
    public static void main(String[] args) {
        int[] data = {3,5,1,7};

        sort(data);

        System.out.println(Calendar.JANUARY);
        Calendar.getInstance();
    }
}
