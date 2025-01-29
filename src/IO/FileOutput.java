package IO;

import java.io.*;

public class FileOutput {
	public static void main(String[] args) throws IOException {
		String menu1 = "Хлеб = 40 рублей\n";
		String fileName = "D:\\Java\\1\\Resources\\menu.txt";

		try(FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
			fileOutputStream.write(menu1.getBytes());
		}

		String menu2 = "Молоко = 60 рублей\n";
		try(FileWriter fileWriter = new FileWriter(fileName, true);) {
			fileWriter.write(menu2);
		}
	}
}
