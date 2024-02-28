package ref;

public class Method1 {

    public static void main(String[] args) {

        Student student1 = new Student(); // x001
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student(); // x002
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1); // x001
        printStudent(student2); // x002

    }
    public static void initStudent(Student student, String name, int age, int grade){ // x001, x002
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    public static void printStudent(Student student) { // x001, x002
        System.out.println("이름: " + student.name + " 나이:" + student.age + " 성적: " + student.grade);
    }
}
