package construct.ex;

public class Book2 {
    String title; // 제목
    String author; // 저자
    int page; // 페이지 수

    void displayInfo(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;

    }
    void displayInfo(String title, String author) {
        this.title = title;
        this.author = author;
        this.page = 0;
    }
    void displayInfo() {
        this.page = 0;
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
