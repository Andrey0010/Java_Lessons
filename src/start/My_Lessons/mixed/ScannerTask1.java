package start.My_Lessons.mixed;

import java.util.Scanner;

public class ScannerTask1 {
    public static void main(String[] args) {
        //ввести в клав 2 числа и  сложить их
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        System.out.println(a + b);
    }
}
