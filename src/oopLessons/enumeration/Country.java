package oopLessons.enumeration;

public enum Country {
	JAPAN("Япония", 300_000_000, "японский"),
	GREECE("Греция", 10_000_000, "греческий"),
	ARGENTINA("Аргентина", 47_000_000, "аргентинский");
	private String name;
	private long population;
	private String language;

	Country(String name, long population, String language) {
		this.name = name;
		this.population = population;
		this.language = language;
	}
	public String getName() {
		return name;
	}
	public long getPopulation() {
		return population;
	}
	public String getLanguage() {
		return language;
	}
	@Override
	public String toString() {
		return "Country{" +
				"name='" + name + '\'' +
				", population=" + population +
				", language='" + language + '\'' +
				'}';
	}
}
