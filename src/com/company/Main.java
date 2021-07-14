package com.company;

public class Main {


    public static void main(String[] args) {
        createObject("Cat");

        createObject("Dog");

        createObject("Horse");


    }

    private static Animal createObject(String className) {
        switch (className) {
            case "Cat":
                Cat cat = new Cat("Молли", 2, "Сиамская");
                cat.print();
                return cat;
            case "Dog":
                Dog dog = new Dog("Лайка", 3, "Овчарка");
                dog.print();
                return dog;
            case "Horse":
                Horse horse = new Horse("Дакар", 5, "Мутстанг");
                horse.print();
                return horse;


        }
        return null;
    }
}

