package poly.basic;
//Java16 - Pattern Matching for instanceof
public class CastingMain6 {

    public static void main(String[] args) {

        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }
    private static void call(Parent parent) {

        parent.parentMethod();
        // Child 인스턴스인 경우 ChildMethod()실행
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스가 맞음");
            // child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스가 아님");
        }
    }
}
