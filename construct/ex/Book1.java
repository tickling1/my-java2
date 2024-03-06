package construct.ex;

public class Book1 {
    String title; // 제목
    String author; // 저자
    int page; // 페이지 수

    Book1(){
        this(null, null, 0);
    }
    Book1(String title, String author){
        this(title,author, 0);

    }
    Book1(String title, String author, int page){
       this.title = title;
       this.author = author;
       this.page = page;
    }
    void displayInfo(Book1[] books){
        for (Book1 book : books){
            System.out.println("제목: " + book.title + ", 저자: " + book.author + ", 페이지: " + book.page);
        }
    }
}
