package start.Zadachki.WHILE;

import java.util.Scanner;

public class Task15p16done {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();

        int b = 10;
        int n = 0;
        int m = 0;
        while(a > 0){
            int c = a;
            a /= b;
            c %= b;
            if(c % 2 == 0) {
                n++;

            }else{
                m += c;
            }

            System.out.println(a + " " + c);


        }
        System.out.println("____________________");
        System.out.println(m);
        System.out.println(n);

    }
}
