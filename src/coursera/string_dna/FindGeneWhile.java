package coursera.string_dna;

/*A. Найдите ген в нити ДНК, где стоп-кодоном может быть любой из трех стоп-кодонов "TAA", "TAG" или "TGA".
B. Найдите все гены (где стоп-кодоном может быть любой из трех стоп-кодонов) в одной нити ДНК.*/

public class FindGeneWhile {
	public String findGene(String dna) {
		int startIndex = dna.indexOf("ATG");
		int currIndex = dna.indexOf("TAA", startIndex + 3);
		while(currIndex != -1) {
			if ((currIndex - startIndex) % 3 == 0) {
				return dna.substring(startIndex, currIndex + 3);
			}else {
				//currIndex = dna.indexOf("TAA", currIndex + 1);
				currIndex += 1;
			}
		}
		return "Ошибка!";
	}
	public void test() {
		String dna = "AATGCGTAATTAATCG";
		System.out.println("DNA strand is " + dna);
		String gene = findGene(dna);
		System.out.println("Gene is " + gene);
	}

	public static void main(String[] args) {
		FindGeneWhile findGeneWhile = new FindGeneWhile();
		findGeneWhile.test();
	}
}
