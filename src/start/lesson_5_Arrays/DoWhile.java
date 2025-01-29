package start.lesson_5_Arrays;

public class DoWhile {
    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println(count);
            count++;
        } while (count < 50);
        System.out.println("++++++++++++++++++++++");
        while (count < 0) {
            count++;
            System.out.println(count);
        }
    }
}





