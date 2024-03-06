package construct.ex;

public class BookMain1 {
    public static void main(String[] args) {

        Book1 book1 = new Book1();

        Book1 book2 = new Book1("Hello Java", "Seo");

        Book1 book3 = new Book1("JPA 프로그래밍", "kim", 700);

        Book1[] books = {book1, book2, book3};

        book1.displayInfo(books);
    }
}
