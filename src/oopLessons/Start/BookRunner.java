package oopLessons.Start;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book("May", "Vasya", 100, false);
        System.out.println(book);

        int lines = book.lines();
        System.out.println(lines);

        int lines1 = book.linesNumber(20);
        System.out.println(lines1);

        String info = book.bookInfo();
        System.out.println(info);


    }
}
