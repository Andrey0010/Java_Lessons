package oopLessons.Start;

public class Zoo {
    private Cat cat;
    private Dog dog;

    public Zoo(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public void feed() {
        cat.feed("Petya", "Fish");
        dog.feed("Masha", "Meat");
    }
}
