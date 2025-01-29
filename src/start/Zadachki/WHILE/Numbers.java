package start.Zadachki.WHILE;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner anyNum = new Scanner(System.in);
        int n = anyNum.nextInt();
        int a = 1;
        int b = 0;
        while (n != 888){
            System.out.println("Попытка" + a + "неудачно");
            a++;
            b += n;
            n = anyNum.nextInt();
            }
        System.out.println("Попытка" + a + "удачно");
        System.out.println("______________");
        System.out.println("Число 888 получено с попытки № " + a);
        System.out.println("Сумма" + " " + b);
        }

    }










