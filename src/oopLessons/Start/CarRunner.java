package oopLessons.Start;

import java.util.Arrays;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car("BBN");
        System.out.println(car);
        /*Car car = new Car("Audi");
        Car car1 = new Car("BNW");
        *//*System.out.println(car.getCountCars());
        System.out.println(car1.getCountCars());*//*

        System.out.println("Quantity of cars " + Car.countCars);

        Car.printBrands();

        System.out.println(Car.BMW_INFO);

        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTIONS));*/

       /* Car.BRAND_DESCRIPTIONS = new String[3];*/ //- так не получится
        Car.BRAND_DESCRIPTIONS[0] = "Xyz"; //-так норм
        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTIONS));




    }
}
