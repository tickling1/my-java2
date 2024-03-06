package construct.ex;

public class BookMain2 {
    public static void main(String[] args) {

        Book2 book1 = new Book2();
        book1.displayInfo();

        Book2 book2 = new Book2();
        book2.displayInfo("Hello java", "seo");

        Book2 book3 = new Book2();
        book3.displayInfo("JPA 프로그래밍", "kim", 700);
    }

}
