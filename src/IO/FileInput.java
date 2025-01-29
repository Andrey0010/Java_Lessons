package IO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInput {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = FileInput.class.getClassLoader().getResourceAsStream("123.txt");
		//FileInputStream fileInputStream = new FileInputStream("D:\\Java\\123.txt");
		//char read = (char) fileInputStream.read();
		String fileName = "D:\\Java\\123.txt";
		FileReader fileReader = new FileReader(fileName, StandardCharsets.UTF_8);
		StringBuilder result = new StringBuilder();
		//char read = (char) fileReader.read();
		while (fileReader.ready()) {
			result.append((char)fileReader.read());
		}
		System.out.println(result);
		System.out.println("_________");
		fileReader.close();

		Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8);
		int count = 1;
		int lineNeeded = 2;
		while(scanner.hasNext()) {
			String nextLine = scanner.nextLine();
			if (count == lineNeeded) {
				System.out.println(nextLine);
			}
			count++;
		}
		scanner.close();
		inputStream.close();

	}
}
