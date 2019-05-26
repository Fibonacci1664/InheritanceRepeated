package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long and Silky");

        //dog.eat();
        dog.walk();
        //dog.run();

        Fish fish = new Fish("Cod", 5, 10, 6, 2, 4);

        fish.swim(15);
    }
}
