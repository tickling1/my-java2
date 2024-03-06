package construct;

public class MemberInit {
    String name; // <= 멤버 변수
    int age; // <= 멤버 변수
    int grade; // <= 멤버 변수

    MemberInit() {

    }
    void initMember(String name, int age, int grade) { // <= 매개 변수 (우선 순위)
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
