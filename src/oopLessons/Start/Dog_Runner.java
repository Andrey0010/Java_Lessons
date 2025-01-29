package oopLessons.Start;

public class Dog_Runner {
    public static void main(String[] args) {
        Dog dog = new Dog("Muhtar", -20, "Vasya");
        Cat cat = new Cat("Black", 15, "Fedya");

        Zoo zoo = new Zoo(cat, dog);
        zoo.feed();
    }
}
