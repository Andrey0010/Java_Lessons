package coursera.string_dna;

public class Task_005 {
	public boolean twoOccurrences(String stringa, String stringb) {
		int occIndex1 = stringb.indexOf(stringa);
		int occIndex2 = stringb.indexOf(stringa, occIndex1 + stringa.length());

		return occIndex1 != -1 && occIndex2 != -1;
	}

	public static void main(String[] args) {
		Task_005 task005 = new Task_005();
		System.out.println(task005.twoOccurrences("aa", "aabbccadfdfaawb"));
	}
}
