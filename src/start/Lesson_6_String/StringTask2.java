package start.Lesson_6_String;

public class StringTask2 {
    public static void main(String[] args) {
        String carMark = "Audi";
        String carModel = "Q3";
        double price = 15_000;
        boolean hasAutomaticTransmission = true;
        //Привет! Я менеджер салона ..
        //У нас есть модель .. за .. цена
        //Есть ли у нее автоматическа коробка передач? да нет

        String result = """
                Привет! Я менеджер салона %s.
                У нас есть модель %s за %f.
                Есть ли у нее автоматическа коробка передач? %s
                """.formatted(carMark, carMark, price, hasAutomaticTransmission ? "да" : "нет");
        System.out.println(result);
    }
}
