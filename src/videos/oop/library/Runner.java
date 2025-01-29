package videos.oop.library;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		Book book1 = new Book("Birds", "Ivanov", 1876);
		Book book2 = new Book("Animals", "Petrov", 1846);
		Book book3 = new Book("Stars", "Pushkin", 1376);
		Book book4 = new Book("Stars", "Sidorov", 1876);

		ArrayList<Book> fantastic = new ArrayList<>();
		Collection collection = new Collection(fantastic);
		collection.addBooks(book3, book2, book1, book4);
		collection.bookInfo("Stars");
	}
}
