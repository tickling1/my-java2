package final1;

public class ConstantMain1 {

    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수: " + 1000);
        int currentUserCount  = 999;
        proess(currentUserCount++);
        proess(currentUserCount++);
        proess(currentUserCount++);
    }
    private static void proess(int currentUserCount) {
        System.out.println("현재 참여자 수: " + currentUserCount);
        if(currentUserCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참가합니다.");
        }
    }
}
