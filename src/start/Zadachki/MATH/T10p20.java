package start.Zadachki.MATH;

import java.util.Random;

public class T10p20 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(1, 10);
        int y  = rand.nextInt(100, 1000);
        System.out.println(x);
        System.out.println(y);
        int y1 = y / 100;
        int y2 = y / 10 % 10;
        int y3 = y % 10;
        if (y1 > y2 && y1 > y3){
            System.out.println(y1 - x);
        }else if (y2 > y1 && y2 > y3){
            System.out.println(y2 - x);
        }else if (y3 > y1 && y3 > y2){
            System.out.println(y3 - x);
        }

    }
}
