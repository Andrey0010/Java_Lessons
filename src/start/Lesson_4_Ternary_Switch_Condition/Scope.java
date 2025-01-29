package start.Lesson_4_Ternary_Switch_Condition;

public class Scope {
    public static void main(String[] args) {
        double priceCar = 10000;
        if (priceCar > 9000){
            double oldPriceCar = priceCar;
            priceCar *= 0.95;
            System.out.println(oldPriceCar);
        }
        //oldPriceCar вне скобок не видна
        System.out.println(priceCar);
    }
}
