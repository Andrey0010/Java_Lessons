package start.Zadachki.ARRAYS;

import java.util.Random;

public class T19p15p152 {
    public static void fillArray(int[] array) {
        Random rand = new Random();
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int randomValue = rand.nextInt(90) + 10; // Generate a random two-digit number
            array[i] = randomValue;
            array[length - 1 - i] = randomValue;
        }
        // If the array has an odd length, fill the middle element
        if (length % 2 != 0) {
            array[length / 2] = rand.nextInt(90) + 10;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[6];
        fillArray(array);
        System.out.println(java.util.Arrays.toString(array));
    }
}


















