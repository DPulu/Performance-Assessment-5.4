/*
 * Name: Dustin Pulu
 * Date: March 30, 2026
 * Assignment: SDC230 Performance Assessment - Inheritance & Overriding
 * Description: This class represents an Animal with a name and
 * a number of legs, and prints those properties to the console.
 */

public class Animal {
    private String Name;
    private int Legs;

    public Animal(String name, int legs) {
        Name = name;
        Legs = legs;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLegs() {
        return Legs;
    }

    public void setLegs(int legs) {
        Legs = legs;
    }

    public void printAnimal() {
        System.out.printf("The Animal's name is %s and it has %d legs.%n", Name, Legs);
    }
}