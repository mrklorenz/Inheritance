package com.company;

import model.Tiger;

public class Main {

    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        tiger1.produceMeowingSound("Tiger 1");
        System.out.println("Tiger Age: " + tiger1.getAge());
        System.out.println("Tiger Weight: " + tiger1.getWeight());
    }
}
