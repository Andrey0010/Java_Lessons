package start.Lesson_3_Primitives_Math_Op;

public class Primitives {
    public static void main(String[] args) {
        //Логические значение (булевы значения)
        //Инстна -> true - да - 1
        boolean answerAndrey = true;
        //Ложь -> нет -> нет - 0
        boolean answerAndrea = false;

        //Целые числа
        //Byte - байт
        byte maxByte = 127;
        byte minByte = -128;

        //Short - короткое число, сост из 2 байт\16бит
        short maxShort = 32767;
        short minShort = -32768;

        //Integer - целое число, кот состоит из 4 байт\32 бит
        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;

        //Long - целое число кот сост из 8байт\64бит
        long maxLong = 9_223_372_036_854_775_807L;
        long mixLong = -9_223_372_036_854_775_808L;

        //Double - число с плав точкой, кот имеет 64 бит
        double myBottle = 1.5;

        //Float - число с плавающей точкой, 32 бит
        float myCola = 0.33F;

        double doubleNumber = 1.12345678901234567890;
        float floatNumber = 1.12345678901234567890F;
        System.out.println(doubleNumber);
        System.out.println(floatNumber);

        //Char - character (символ), 16 бит
        char letter = 70;
        //System.out.println(letter);

        char newLine = '\n';
        System.out.print("a");
        System.out.print(newLine);
        System.out.println("b");

        //char tab = '\t';
        char escape = '\\';
        System.out.print(escape);




     }

}
