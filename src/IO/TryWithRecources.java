package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithRecources {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("D:\\Java\\1\\Resources\\123.txt");
			throw new RuntimeException("Exception");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally Block");
			fileReader.close();
		}

		try(FileReader fileReader2 = new FileReader("D:\\Java\\1\\Resources\\123.txt")) {
			 throw new RuntimeException("Exception");
		} catch (Exception e) {
			System.out.println("Обработал ошибку");
		}

	}
}
