package videos.oop.library;

/*Реализуйте возможность добавлять книги в коллекцию и получать информацию о книге по её названию.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection {
	private ArrayList<Book> list;

	public Collection(ArrayList<Book> list) {
		this.list = list;
	}
	public void addBooks(Book ...books) {
		list.addAll(Arrays.asList(books));
	}
	public void bookInfo(String bookName) {
		int n = 0;
		for (Book i : list) {
			if (i.getName().equals(bookName)) {
				System.out.printf("Книга %s: %s%n", n + 1, i);
				n++;
			}
		}
		if (n == 0)
			System.out.println("Данной книги нет в списке");
	}

	@Override
	public String toString() {
		return "Collection{" +
				"list=" + list +
				'}';
	}
}
