package start.Zadachki.WHILE;

import java.util.Scanner;

public class While15point10 {
    public static void main(String[] args) {
        //Ввести число, выводить на экран последующие числа, пока число не станет отрицательным
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        int m;
        while (x>0){
            m = num.nextInt();



                if (m > x){
                    System.out.println("Ввод не возможен");
                    x -= m;
                }else{
                    x -= m;
                    System.out.println("new " + x);
                }

                }

        System.out.println("_____________");
        System.out.println(x);





        }








    }

