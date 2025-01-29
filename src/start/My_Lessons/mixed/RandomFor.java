package start.My_Lessons.mixed;

import java.util.Random;
import java.util.Scanner;

public class RandomFor {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        for (int i = 0; i < 3; i++) {
            System.out.println(rand.nextInt(0, a));

        }
    }
}
