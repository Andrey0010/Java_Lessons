package start.lesson_5_Arrays;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int[] numbers2 = {5, 6, 7, 8};
        int[][] all = {numbers, numbers2};
        for (int[] number : all) {
            System.out.println(Arrays.toString(number));
        }
        System.out.println("______________________");

        int[] num = {10, 11, 12};
        for (int i : num){
            System.out.println(i);
        }
    }
}
