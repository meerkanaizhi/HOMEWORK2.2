package com.company;

public class Horse extends Animal implements Printable {

    private String name;
    private int age;
    private String breed;

    public Horse(String name, int age, String breed) {
        super(name, age, breed);
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public String getBreed() {
        return breed;
    }








    @Override
    public void print() {
        System.out.println(name  + " " + age +  "года"+ " " + breed + "   ");
    }
}

