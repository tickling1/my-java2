package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("ssambbong", "coding");
        member.print();
        member.changeData("coding","ssambbong");
        member.print();
    }
}
