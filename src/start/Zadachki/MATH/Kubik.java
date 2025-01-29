package start.Zadachki.MATH;

import java.util.Random;
import java.util.Scanner;

public class Kubik {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int r = 1;
        int a1 = 0;
        int b1 = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Round %d. ", r);
            r++;
            int a = rand.nextInt(1, 2);
            int b = rand.nextInt(1, 2);
            System.out.printf("%d ", a);
            System.out.printf("%d --> ", b);
            a1 += a;
            b1 += b;
            if (a == b){
                System.out.println("Ничья");
            }else if (a > b) {
                System.out.println("Первый игрок победитель!");
            }else {
                System.out.println("2й игрок победитель!");}

        }
        System.out.println("___________");
        System.out.println(a1 + " " + b1);
        if (a1 < b1) {
            System.out.println("2й игрок победитель!");
        } else if (a1 > b1) {
            System.out.println("Первый игрок победитель!");
        } else if (a1 == b1) {
            System.out.println("Ничья");

            do {
                System.out.println("Дополнительный бросок");
                int a = rand.nextInt(1, 3);
                int b = rand.nextInt(1, 3);
                a1 += a;
                b1 += b;

                System.out.printf("%d ", a);
                System.out.printf("%d --> ", b);
            } while (a1 == b1);

            if (a1 < b1) {
                System.out.println("2й игрок победитель!");
            } else {
                System.out.println("Первый игрок победитель!");
            }

        }






    }
}
