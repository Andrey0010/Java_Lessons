package oopLessons.Start;

import java.util.Arrays;

public class Car {
    private String brand;
    public static int countCars;
    public final static String BMW_INFO = "BMW is a German company";
    public final static String AUDI_INFO = "AUDI is a German company";
    public final static String KIA_INFO = "KIA is a Korean company";
    public final static String[] BRAND_DESCRIPTIONS = new String[3];

    static {
        BRAND_DESCRIPTIONS[0] = BMW_INFO;
        BRAND_DESCRIPTIONS[1] = AUDI_INFO;
        BRAND_DESCRIPTIONS[2] = KIA_INFO;
        System.out.println(Arrays.toString(BRAND_DESCRIPTIONS));
    }

    public Car(String brand) {
        this.brand = brand;
        countCars++;
    }
    public static int getCountCars() {
        return countCars;
    }
    public static void printBrands() {
        System.out.println("Available Brands: BNM, AUDI");
    }
}
