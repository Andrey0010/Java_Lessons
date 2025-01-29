package oopLessons.Dogs;

public class Poodle extends Dog {

    public Poodle() {
        super(28);
    }


    @Override
    public void run() {
        System.out.println("Собака бежит медленно");
    }

    @Override
    public void breathe() {
        System.out.println("Пудель дышит быстро");
    }
}
