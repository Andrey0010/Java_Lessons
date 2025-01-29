package coursera.string_dna;

public class Task_003 {
	public String findGene(String dna) {
		int start = dna.indexOf("ATG");
		if (start == -1) {
			return "";
		}
		int stop = dna.indexOf("TAA", start + 3);
		if (stop == -1) {
			return "";
		}
		return dna.substring(start, stop + 3);
	}

	public static void main(String[] args) {
		Task_003 string003Task = new Task_003();
		string003Task.findGene("SAATGKJHKHJKJHKJHKJHTAASA");
	}
}
