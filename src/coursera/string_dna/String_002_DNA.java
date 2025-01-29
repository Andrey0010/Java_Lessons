package coursera.string_dna;

public class String_002_DNA {
	public String findGene(String dna) {
		String result = "";
		int startIndex = dna.indexOf("ATG"); //если такого нет, то он вернет -1
		if (startIndex == -1) {
			return "";
		}
		int stopIndex = dna.indexOf("TAA", startIndex + 3);
		if (stopIndex == -1) {
			return "";
		}
		result = dna.substring(startIndex, stopIndex + 3);

		return result;
	}

	public static void main(String[] args) {
		String_002_DNA string002Dna = new String_002_DNA();
		System.out.println(string002Dna.findGene("CGATGGTTTGT"));
	}
}
