package coursera.string_dna;

public class Task_004 {
	public String findGene(String dna, String start, String stop) {
		int startIndex = dna.indexOf(start);
		int stopIndex = dna.indexOf(stop, startIndex + 3);
		if (startIndex == -1 || stopIndex == -1 || (stopIndex - startIndex) % 3 != 0){
			return "oops";
			}
		return dna.substring(startIndex, stopIndex + 3);
	}

	public static void main(String[] args) {
		Task_004 task004 = new Task_004();
		System.out.println(task004.findGene("AATGQQQEEETAASA", "ATG", "TAA"));
	}
}
