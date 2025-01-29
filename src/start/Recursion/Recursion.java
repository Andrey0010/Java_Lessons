package start.Recursion;

public class Recursion {
    public static int sum (int k) {
        if (k < 1) {
            return 0;
        }int result  = k + sum(k - 1);
        return result;
    }

    public static void main(String[] args) {
        int sum = Recursion.sum(3);
        System.out.println(sum);
    }
}





