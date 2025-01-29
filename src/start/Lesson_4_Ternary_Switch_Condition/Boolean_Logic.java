package start.Lesson_4_Ternary_Switch_Condition;

public class Boolean_Logic {
    public static void main(String[] args) {
        //Сынок, купи хлеба
        boolean isBoughtBread = true;

        //Сынок, купи молоко
        boolean isBoughtMilk = false;

        //And (&&)- логическое и, если два значение true - тогда true, если нет - false

        boolean isBoughtMilkAndBread = isBoughtBread && isBoughtMilk;
        //boolean isBoughtMilkAndBread = true && true;
        //boolean isBoughtMilkAndBread = true;

        if (isBoughtBread && isBoughtMilk) {
            System.out.println("Молодец, купили и то и то");
        } else if (isBoughtMilk) {
                System.out.println("Молодец, купил только молоко");
            } else if (isBoughtBread) {
            System.out.println("Молодец, купил только хлеб");
        } else {
            System.out.println("Не молодец");
        }

        //Or (||) - логическое или - если хотя бы 1 значение true - тогда true, и только если все false - тогда false
        //boolean isBoughtMilkOrBread = true || true;
        //boolean isBoughtMilkOrBread = true || false;
        //boolean isBoughtMilkOrBread = true;
        //boolean isBoughtMilkOrBread = false || false;
        //boolean isBoughtMilkOrBread = false;

        //Не (!) - логический оператор, который переворачивает true на false и наоборот
        //Купил сладости или нет
        boolean isBoughtCandy = false;
        if (!isBoughtCandy){
            System.out.println("Мама хвалит");
        }else {
            System.out.println("Мама не хвалит");
        }





    }
}
