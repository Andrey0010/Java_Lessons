package start.Lesson_6_String;

public class MyString {
    public static void main(String[] args) {
        char symbol = 'a';
        String text = new String( "\tHey");
        String text2 = new String( "Hey");
        System.out.println(text.equals(text2));

        System.out.println(text);
        System.out.println(text2);

        //сравнение классов - equals
        //сравнение объектов - ==
    }
}
