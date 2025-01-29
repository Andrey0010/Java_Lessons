package start.lesson_5_Arrays;

public class MultiArray {
    public static void main(String[] args) {
        //Ограбили магазин, вор был ростом 178
        //Задача: найти вора по росту
        int[] group1 = {180, 178, 190};
        int[] group2 = {165, 195, 193};
        int[][] groups = {group1, group2};
        upperFor:
        for (int[] check : groups){
            for (int t : check){
            if (t == 178){
                System.out.println("thief");
                break upperFor;

            } else {
                System.out.println("relax");
            }
            }

        }

            }
        }





