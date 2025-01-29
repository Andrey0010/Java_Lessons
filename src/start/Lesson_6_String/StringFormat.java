package start.Lesson_6_String;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Andrey";
        int age = 30;
        //String phrase = "Меня зовут " + name + ". " + "Мне " + age + " лет" + ".";
//        String phrase = String.format("Меня зовут %s. Мне %d.", name, age);
//        System.out.println(phrase);
        System.out.printf("Меня зовут %s. Мне %d.", name, age);
    }
}
