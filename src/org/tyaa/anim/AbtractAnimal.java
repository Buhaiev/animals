package org.tyaa.anim;

public abstract class AbtractAnimal {

    private double weight;

    private int age;

    public void eat() {
        System.out.println("Я питаюсь");
    }

    public void setWeight(double weight) {
        this.weight=weight;
    }

    public double getWeight() {
       return weight;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public abstract void breathe();
}
