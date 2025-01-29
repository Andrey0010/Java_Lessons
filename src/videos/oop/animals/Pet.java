package videos.oop.animals;
/*Создайте систему для учета домашних животных в приюте. Каждое животное имеет уникальное имя, возраст и вид (например, собака или кошка).
Реализуйте возможность создания объектов животных с помощью конструктора.
Добавьте метод, который возвращает описание животного в виде строки (например, "Собака, имя: Бобик, возраст: 3 года").
Перегрузите метод для получения описания, чтобы он мог принимать формат (например,"text") и возвращать описание в соответствующем формате.
Добавьте класс, который представляет конкретный вид животного, например, "Собака" и "Кошка", и реализуйте наследование от общего класса "Животное".
Введите абстрактный метод, который должен быть реализован в каждом из подклассов, например, "звук животного".*/
public abstract class Pet {
	private String name;
	private int age;
	private String species;

	public Pet(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSpecies() {
		return species;
	}

	public String petDescription() {
		return getSpecies() + ", " + "имя " + getName() + ", " + "возраст " + getAge();
	}
	public String petDescription(String format) {
		if ("text".equalsIgnoreCase(format)) {
			return petDescription();
		}
		// Add more formats if needed
		return petDescription();
	}

	public abstract void sound();

	@Override
	public String toString() {
		return "Pet{" +
				"name='" + name + '\'' +
				", age=" + age +
				", species='" + species + '\'' +
				'}';
	}
}
