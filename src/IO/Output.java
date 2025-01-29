package IO;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Output {
	public static void main(String[] args) {
		PrintStream consoleOut = System.out;

		ByteArrayOutputStream data = new ByteArrayOutputStream();
		System.setOut(new PrintStream(data));
		System.out.println("Hello World");

		System.setOut(consoleOut);
		System.out.println(String.valueOf(data).toUpperCase());
	}
}
