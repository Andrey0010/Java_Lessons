package start.My_Lessons.mixed;

public class StringCheck {
    public static void main(String[] args) {

        String check = "10" + 102;
        int number = Integer.parseInt(check);
        int count = check.length();
        System.out.println(number);
        System.out.println(check.length());
    }
}
