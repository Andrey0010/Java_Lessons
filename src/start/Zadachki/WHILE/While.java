package start.Zadachki.WHILE;

public class While {
    public static void main(String[] args) {
        int a = 20;
        int b = 6;
        int c = 5;
        while (a % b != 0) {
            a += c;
            System.out.println(a + ";");
        }if (a % b == 0){
            System.out.println("___________________");
            System.out.println(a);
        }
    }
}
