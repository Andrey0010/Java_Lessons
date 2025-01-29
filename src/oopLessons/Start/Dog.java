package oopLessons.Start;

import java.util.Arrays;

public class Dog {
    private String name = "Lord";
    private int weight = 50;
    private String owner = "And";

    {
        System.out.println("Dog says Hello!");
    }

    public Dog() {}


    public Dog(String name, int weight, String owner) {
        this.name = name;
        this.owner = owner;
        if (weight < 0) {
            this.weight = 5;
        } else {
            this.weight = weight;
        }
    }

    public void setWeight(int newWeight) {
        if (newWeight < 0) {
            this.weight = 6;
        } else {
            this.weight = newWeight;
        }
    }

    public String getOwner() {
        return "Mr " + owner;
    }

    public void feed (String giver, String ...product) {
        System.out.printf("%s has fed the dog. It has eaten %s \n", giver, Arrays.toString(product));
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
