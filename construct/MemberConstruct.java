package construct;

public class MemberConstruct {
    String name; // <= 멤버 변수
    int age; // <= 멤버 변수
    int grade; // <= 멤버 변수


    //추가
    MemberConstruct(String name, int age) {

        this(name, age, 0); // 변경
        //this.name = name;
        //this.age = age;
        //this.grade = 0;
    }
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name= " + name + ", age= " + age + ", grade= " +grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
