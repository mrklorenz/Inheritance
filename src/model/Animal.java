package model;

public class Animal {
    //age, weight, running and eating. Create corresponding get and set methods and constructor methods for its attributes.
    public int age;
    public int weight;

    public Animal(){}

    public void running(){
        System.out.println("Animal is running.");
    }

    public void eating(){
        System.out.println("Animal is eating.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
