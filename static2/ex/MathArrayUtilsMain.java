package static2.ex;

import static static2.ex.MathArrayUtils.*;
public class MathArrayUtilsMain {

    public static void main(String[] args) {

        int[] values = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("sum = " + sum(values));
        System.out.println("average = " + average(values));
        System.out.println("min = " + min(values));
        System.out.println("max = " + max(values));

    }
}
