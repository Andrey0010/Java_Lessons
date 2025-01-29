package start.lesson_5_Arrays;

import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args) {
        String question = "Столица Страны";
        String answer = "Город";
        String[] array = new String[2];
        array[0] = question;
        array[1] = answer;
//        array [0] = question;
//        array [1] = answer;

        System.out.println(Arrays.toString(array));


    }
}
