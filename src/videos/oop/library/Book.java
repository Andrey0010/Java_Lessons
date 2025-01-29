package videos.oop.library;
/*Создайте класс для управления коллекцией книг.
Каждая книга должна иметь уникальные характеристики (например, название, автора, год издания).
Реализуйте возможность добавлять книги в коллекцию и получать информацию о книге по её названию.*/
public class Book {
	private String name;
	private String author;
	private int year;

	public Book(String name, String author, int year) {
		this.name = name;
		this.author = author;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Book{" +
				"name='" + name + '\'' +
				", author='" + author + '\'' +
				", year=" + year +
				'}';
	}
}
