package oopLessons.DefendDogs;

import oopLessons.Dogs.Dog;

public final class Shepherd extends Dog {

    public Shepherd() {
        super(30);
    }

    @Override
    public void run() {
        System.out.println("Собака бежит быстро");
    }

    @Override
    public void breathe() {
        System.out.println("Овчарка дышит медленно");
    }

    @Override
    public void bark() {
        System.out.println("Овчарка громко лает");
    }



    @Override
    public void beAngry() {
        System.out.println("Собака стоит на " + super.countLegs + " лапах");
        System.out.println("Овчарка увидела чужого человека");
        super.beAngry();
        System.out.println("Овчарка успокоилась");
    }
}
