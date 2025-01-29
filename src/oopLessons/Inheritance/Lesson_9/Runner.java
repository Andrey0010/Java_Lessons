package oopLessons.Inheritance.Lesson_9;

import oopLessons.Dogs.Poodle;
import oopLessons.DefendDogs.Shepherd;
import oopLessons.Dogs.Terier;

public class Runner {
    public static void main(String[] args) {

        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        poodle.breathe();
        System.out.println(poodle.countTeeth);

        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.breathe();
        System.out.println(shepherd.countTeeth);
        shepherd.beAngry();
        shepherd.eat();


        Terier terier = new Terier(50);
        System.out.println(terier.countTeeth);

        //наследование возможно только от одного класса


    }
}
