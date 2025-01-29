package oopLessons.Start;

public class Book {
    String bookName;
    String bookAuthor;
    int bookPages;
    boolean isDoc;

    public Book (String name, String author, int pages, boolean doc) {
        this.bookName = name;
        this.bookAuthor = author;
        this.bookPages = pages;
        this.isDoc = doc;

    }

    public int lines () {
        int linesNumber = bookPages * 40;

        return linesNumber;
    }

    public int linesNumber (int linesPerPage) {
        int linesNumber = linesPerPage * bookPages;
        return linesNumber;
    }

    public String bookInfo() {
        if (isDoc){
            return bookName + " by " + bookAuthor + " documentary";
        }return bookName + " by " + bookAuthor + " fiction";
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPages=" + bookPages +
                ", isDoc=" + isDoc +
                '}';
    }
}
