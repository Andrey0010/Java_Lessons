package start.My_Lessons.mixed;

public class RandomV1 {
    public static void main(String[] args) {

        //Math random возвращает значение типа double
        //оно возвращает значение от 0 до 0,99
        int a;
        int b;
        a = (int) (Math.random() * 10 + 1);
        b = (int) (Math.random() * 10 + 1);
        System.out.println(a);
        System.out.println(b);
    }
}
