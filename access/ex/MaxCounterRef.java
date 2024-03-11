package access.ex;

public class MaxCounterRef {
    private int count;
    private int max;

    public MaxCounterRef(int max) {
        this.count = 0;
        this.max = max;
    }
    public int getCount(){
        return count;
    }
    public void increment() {
        // 검증 로직
        if (max <= count) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        // 실행 로직
        count++;
    }
}
