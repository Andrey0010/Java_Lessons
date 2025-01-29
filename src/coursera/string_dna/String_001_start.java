package coursera.string_dna;

public class String_001_start {
	public static void main(String[] args) {
		String s = "Hi, there! How are you?";
		String x = s.substring(4, 7);
		System.out.println(s.length());
		System.out.println(s.indexOf("there"));
		System.out.println(s.indexOf("H", 2));
		System.out.println(s);
		System.out.println(x);
		System.out.println(s.startsWith("Ho"));
		System.out.println(s.endsWith("you?"));
	}
}
