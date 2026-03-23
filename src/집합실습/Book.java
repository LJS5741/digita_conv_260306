package 집합실습;

public class Book {
    int isbn;
    String title;
    String author;

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public int hashCode() {
        return isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            if (this.isbn == book.isbn) return true;
            else return false;
        }
        return false;
    }

//    public String toString() {
//        return "ISBN : " + isbn + "\n" + "Title : " +
//                title + "\n" + "Author : " + author + "\n"
//                + "---------------------------------\n";
//    }

    public void showBook() {
        System.out.println("ISBN : " + isbn);
        System.out.println("제목 : " + title);
        System.out.println("저자 : " + author);
    }
}
