/*
 * Name: Dustin Pulu
 * Date: March 30, 2026
 * Assignment: SDC230 Performance Assessment - Inheritance & Overriding
 * Description: This program demonstrates inheritance and overriding
 * by creating Animal and Cat objects, printing their properties,
 * updating their values, and printing the updated results.
 */

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Dustin Pulu - Week 5 PA - Inheritance & Overriding");
        System.out.println();

        Animal a = new Animal("Roo", 2);
        Cat c = new Cat("Fluffy", 4, "meow");

        a.printAnimal();
        c.printAnimal();

        a.setName("Flipper");
        a.setLegs(0);

        c.setName("Garfield");
        c.setSound("I'm HUNGRY");

        a.printAnimal();
        c.printAnimal();
    }
}