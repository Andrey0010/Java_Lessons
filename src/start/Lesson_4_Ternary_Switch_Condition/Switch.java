package start.Lesson_4_Ternary_Switch_Condition;

public class Switch {
    public static void main(String[] args) {
        //1-пн, 2 - вт и тд
        int numberDay = 2;

        switch (numberDay){
//            case 1:
//                System.out.println("Понедельник");
//                break;
//            case 2:
//                System.out.println("Вторник");
//                break;
//            case 7:
//                System.out.println("Воскресенье");
//                break;
//            default:
//                System.out.println("Данного дня не существует");
//                break;

            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Данного дня не существует");

        }

        /*if (numberDay == 1){
            System.out.println("Понедельник");
        }else if (numberDay == 2){
            System.out.println("Вторник");*/
        }

    }

