package start.lesson_5_Arrays;

import java.util.Arrays;

public class Task_Katar {
    public static void main(String[] args) {
        String q = "Stolica Katara";
        String a = "Doha";
        String[] line = {q, a};
        System.out.println(Arrays.toString(line));

        char[] answer = {'D', 'o', 'h', 'a'};
        System.out.println(Arrays.toString(answer));
    }
}
