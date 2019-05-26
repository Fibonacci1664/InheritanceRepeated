package com.davegreen;

/**
 * Created by daveg on 20/06/2017.
 */
public class Fish extends Animal
{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins)
    {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest()
    {

    }

    private void moveMuscles()
    {
        System.out.println("Fish.moveMuscles() called, the fish move its muscles");
    }

    private void moveFins()
    {
        System.out.println("Fish.moveFins() called, the fish moves its fins");
    }

    public void swim(int speed)
    {
        moveMuscles();
        moveFins();
        super.move(speed);
    }
}
