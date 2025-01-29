package start.lesson_5_Arrays;

public class Continue {
    public static void main(String[] args) {
        //Тренер бросает кости. Если от 1 до 5, то ученик отимается.
        //Если 6 , ученик отдыхает.
        int[] dice = {3, 5, 6, 2, 1};
        for (int i : dice){
            if (i == 6){
                System.out.println(i + " relax");
                continue;
            }
                System.out.println(i + " push");
        }
//        for (int i : dice){
//            if (i == 6){
//                System.out.println(i + " relax");
//            }else {
//                System.out.println(i + " push");
//            }
//        }

    }
}
