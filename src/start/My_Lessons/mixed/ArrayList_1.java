package start.My_Lessons.mixed;

import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);

        }
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(99));
        System.out.println(list.size());
    }
}
