package coursera.string_dna;

public class Task {
	public String findGene(String dna) {
		int start = dna.indexOf("ATG");
		int stop = dna.indexOf("TAA", start + 3);
		if (stop == -1 || start == -1 || (stop - start) % 3 != 0) {
			return "";
		}
		return dna.substring(start, stop + 3);
	}
	public void testSimpleGene() {
		String dna = "SAATGQQQEEETAASA";
		System.out.println(dna);
	}

	public static void main(String[] args) {
		Task task = new Task();
		System.out.println(task.findGene("SAATGQQQEEETAASA"));
	}
}
