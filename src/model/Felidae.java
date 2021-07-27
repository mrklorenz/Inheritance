package model;

public class Felidae extends Animal{
    public Felidae(){
        this.age = 5;
        this.weight = 60;
    }

    public void produceMeowingSound(String animalName){
        System.out.println(animalName + " is meowing meowing..");
    }
}
