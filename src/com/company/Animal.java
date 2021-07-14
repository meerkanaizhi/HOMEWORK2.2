package com.company;

import javax.naming.Name;

public abstract class Animal implements Printable {

    private Object Name;
    private String name;
    private Object Age;
    private int age;
    private Object Breed;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return (int) age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void print() {

    }

    public  Animal(String name, int age, String breed) {
        Name = name;
        Age = age;
        Breed = breed;








    }

}

