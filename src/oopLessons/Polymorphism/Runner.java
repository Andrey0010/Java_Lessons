package oopLessons.Polymorphism;

public class Runner {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal cat = new Cat();
		dog.eat();
		cat.eat();
		//dog.bark();

		Animal[] animals = new Animal[2];
		animals[0] = dog;
		animals[1] = cat;

		for (Animal animal : animals) {
			animal.eat();
		}
		feedAnimals(dog, cat);
	}
	public static void feedAnimals(Animal animal1, Animal animal2) {
		animal1.eat();
		animal2.eat();
	}
}
