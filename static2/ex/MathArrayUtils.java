package static2.ex;

public class MathArrayUtils {

    static int sum(int[] values){
        int sum = 0;
        for (int n : values) {
            sum += n;
        }
        return sum;
    }
    static double average(int[] values) {
        int sum = 0;
        double average = values.length;
        for (int n : values) {
            sum += n;
        }
        average = sum / average;
        // return average;
        return sum(values) / average;
    }
    static int min(int[] values) {
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
            }
        }
        return min;
    }
    static int max(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
            // for(int value : values) {
                // if(value > max){
                    // max = value; }}

        }
        return max;
    }
    private MathArrayUtils() {
        // 인스턴스 생성을 막는다.
    }
}
