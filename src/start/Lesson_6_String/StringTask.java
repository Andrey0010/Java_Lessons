package start.Lesson_6_String;

import java.util.Arrays;

public class StringTask {
    public static void main(String[] args) {
        //Выбрать текст, начиная с 11 символа до конца строки, перевести в нижний регистр
        //Разбить строку на массив по пробелу. Вывести на экран каждое слово из массива и длину строки этого слова.
        String text = "my name is Giovanni Giorgio";
        int length = text.length();
        System.out.println(length);

        String lowerCase = text.substring(11, 27).toLowerCase();
        System.out.println(lowerCase);

        String[] split = text.split(" ");
        System.out.println(Arrays.toString(split));

        for (String i : split){
            System.out.println(i + " " + i.length());
        }


    }
}
