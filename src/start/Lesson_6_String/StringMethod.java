package start.Lesson_6_String;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Hello, World.";
        //Перевод в верхний регистр ------------ text.toUpperCase() => ctrl+alt+V => textUpper
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);
        
        //Перевод в нижний регистр ------------ text.toLowerCase() => ctrl+alt+V => textLower
        String textLower = text.toLowerCase();
        System.out.println(textLower);

        //Длина строки   ------------------------ text.length => ctrl alt V length
        int length = text.length();
        System.out.println(length);

        //Есть ли в тексте другой текст ________
        boolean containsHello = text.contains("Hello");
        System.out.println(containsHello);

        //Замена всех кусков текста на другой текст
        String replaceAll = text.replaceAll("r", "a");
        System.out.println(replaceAll);

        //Повторить текст n раз
        String repeatText = text.repeat(10);
        System.out.println(repeatText);

        //Разбить текст на массив String
        String names = "Yuri;Olga;Petr;Vasya";
        String[] namesArray = names.split(";");
        System.out.println(Arrays.toString(namesArray));

        //Объединение строк (конкатенация)
        String word1 = "Hi";
        String word2 = "Friend";
        String result = word2 + word1;
        System.out.println(result);

        //Начинается на подстроку
        boolean startsWithHe = text.startsWith("He");
        System.out.println(startsWithHe);

        //Заканчивается на подстроку
        boolean endWith = text.endsWith("ld.");
        System.out.println(endWith);

        //Обрезка строки (первые 5 символов)
        String substring = text.substring(0, 5);
        System.out.println(substring);
        System.out.println("________________");

        String length1 = "hello".replaceAll("l", "a").toUpperCase();
        System.out.println(length1);


    }
}
