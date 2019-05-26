package com.davegreen;

/**
 * Created by daveg on 20/06/2017.
 */
public class Dog extends Animal
{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

                                                                                                                        // In using 1 as an argument this sets that value to true
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat)                // stating that all DOGS have a brain and body, this then allows
    {                                                                                                                   // us to remove these as parameters from our constructor which in
        super(name, 1, 1, size, weight);                                                                    // turn makes our code easier to read and more efficient.
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew()
    {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat()
    {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk()
    {
        System.out.println("Dog.walk() called");
        super.move(10);
    }

    public void run()
    {
        System.out.println("Dog.run() called");         // This will automatically run the super move method
        move(20);                                // if it cannot find an overridden method within the class.
    }                                                   // even though the super keyword has not specifically been used.

    public void moveLegs(int speed)
    {
        System.out.println("Dog.moveLegs() called");
    }

    @Override                                                 // When the move method is called from the run method above
    public void move(int speed)                               // because the super keyword is not used the program searches
    {                                                         // for an overridden method within the class first and if one
        System.out.println("Override Dog.move() called");     // is not found then it will automatically run the super
        moveLegs(speed);                                      // version of the method.
        super.move(speed);
    }
}
