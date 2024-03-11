package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.count = 0;
        this.max = max;
    }
    public int getCount(){
        return count;
    }
    public void increment() {
        if (max <= count) {
            count = max;
        } else {
            count++;
        }
    }
}
