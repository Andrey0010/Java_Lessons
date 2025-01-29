package oopLessons.Dogs;


import oopLessons.Inheritance.Lesson_9.Alive;

public abstract class Dog extends Alive {
    protected final int countLegs = 4;
    public int countTeeth;
    public static final String LATIN_NAME = "Canis Familiaris";

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void beAngry() {
        System.out.println("The dog id growling");
    }

    public void bark() {
        System.out.println("THe dog barks");
    }

    public final void eat() {
        System.out.println("The dog can eat");
    }

    public abstract void run();
}
