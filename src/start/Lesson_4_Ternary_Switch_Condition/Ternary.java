package start.Lesson_4_Ternary_Switch_Condition;


public class Ternary {
    public static void main(String[] args) {
        int sum = 100;
        int bread = 20;
        int milk = 40;
        int change = sum - (bread + milk);
        int pocket;
        pocket = change >= 50 ? 20 : 10;

        System.out.println(change);
        System.out.println(pocket);




        //если сдача больше 50, оставить себе 20
        //если сдача меньше 50, оставить себе 10


//        int money = 100;
//        int breadPrice = 20;
//        int moneyAfterShopping = money - breadPrice;
//        int childMoney = moneyAfterShopping >= 50 ? 10 : 5;
//        moneyAfterShopping -= moneyAfterShopping >= 50 ? 10 : 5;
//        System.out.println(childMoney);
//        System.out.println(moneyAfterShopping);
//


        /*if (moneyAfterShopping >= 50) {
            childMoney = 10;
            moneyAfterShopping -= 10;
        }else {
            childMoney = 5;
            moneyAfterShopping -= 5;

        }System.out.println(childMoney);
        System.out.println(moneyAfterShopping);*/
    }

    }


