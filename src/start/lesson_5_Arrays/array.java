package start.lesson_5_Arrays;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        //int[] array = new int[]{x, y};
        int[] array = {x, y};
        int[] array2 = new int [2];
        array2[0] = array[0];
        array2[1] = array[1];
        array2[1] = 13;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));



//        System.out.println(Arrays.toString(array));
//        System.out.println(array[1]);



//        System.out.println(x);
//        System.out.println(y);

//        int[] array = new int[3];
//        array[0] = x;
//        array[1] = y;
//        array[2] = 3;

//        int [] array = new int[]{x, y, 3};
//        int [] array = {x, y, 3};
//        int [] array2 = new int [3];
//        array [1] = array2 [1];
//        array2 [0] = array [0];
//        array2 [0] = 13;

//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));


//        System.out.println(Arrays.toString(array));
//        System.out.println(array [0]);
    }
}
