package oopLessons.dependencyInversion;

public class Zoo {
	private Dog dog1;
	private Dog dog2;

	public Zoo(Dog dog1, Dog dog2) {
		System.out.println("Конструктор для любых собак");
		this.dog1 = dog1;
		this.dog2 = dog2;
	}

	public Zoo(Poodle poodle, Shepherd shepherd) {
		System.out.println("Конструктор для пуделя и овчарки");
		this.dog1 = poodle;
		this.dog2 = shepherd;
	}
}
