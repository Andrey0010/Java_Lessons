package start.Zadachki.IF;

public class if_Treug {
    public static void main(String[] args) {
        //зациклить, пока не подберет значения удовлетворяющие формуле cat1*cat1 + cat2*cat2 = hippo*hippo
        int a = 1;
        int b = 2;
        int h =4;
        int p = (a + b + h) / 2;
        int s = (int) Math.sqrt(p * (p - a) * (p - b) * (p - h));
        boolean sq = s == (int) Math.sqrt(p * (p - a) * (p - b) * (p - h));
        int n = 0;
        boolean eq = (a*a + b*b) == h*h;
//        if (eq && cat1 > 0 && cat2 > 0 && hippo > 0){
//            System.out.println("это треуг");
//        }else {
//            System.out.println("не треуг");
//        }
        while (!sq){
            a = (int) (Math.random() * 100) + 1;
            b = (int) (Math.random() * 100) + 1;
            h = (int) (Math.random() * 100) + 1;

            System.out.println(a);
            System.out.println(b);
            System.out.println(h);

            n++;


        }
        System.out.println(a + " " + b + " " + h);
        System.out.println("Попыток " + n);



        }

    }











