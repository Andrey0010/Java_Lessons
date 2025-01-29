package start.My_Lessons.mixed;

import java.util.Scanner;

public class ScannerChar {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        char a = letter.next().charAt(0);
        if (a <= 'z' && a >= 'a'){
            System.out.println("from abc");
        }else{
            System.out.println("not from abc");
        }


    }
}
