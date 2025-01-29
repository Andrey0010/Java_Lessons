package oopLessons.Start;

import java.util.Arrays;

public class Cat {
    public String color;
    Double weight;
    private String ownerName;

    {
        System.out.println("Cat says Hello!");
    }

    public Cat (String colorName, double weightCat, String owner) {
        this.color = colorName;
        this.weight = weightCat;
        this.ownerName = owner;
    }

    public void feed (String giver, String ...product) {
        System.out.printf("%s has fed the cat. It has eaten %s \n", giver, Arrays.toString(product));
    }

    public void destroySofa(String sofaOwner) {
        System.out.println("Кот дерет " + sofaOwner + "'s диван");
    }

    public String hunt(boolean isDay) {
        if (isDay) {
            return "Mouse";
        }return "Bird";
    }

    public String hunt(boolean isDay, boolean isSuccess) {
        if (isSuccess) {
            if (isDay) {
                return "Mouse";
            }
            return "Bird";

        }
        return "None";
    }

    public void hunt(String timesOfDay) {
        if (timesOfDay.equals("Morning")) {
            System.out.println("Mouse");
        }else {
            System.out.println("Mosquito");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

    public static class Zoo {
        public static void main(String[] args) {
            Cat cat = new Cat("Black", 20, "Ivan");
            String color = cat.color;
            System.out.println(color);
            System.out.println(cat.color);
        }
    }
}
