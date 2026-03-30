/*
 * Name: Dustin Pulu
 * Date: March 30, 2026
 * Assignment: SDC230 Performance Assessment - Inheritance & Overriding
 * Description: This class represents a Cat, which extends Animal
 * by adding a sound property and overriding the printAnimal method.
 */

public class Cat extends Animal {
    private String Sound;

    public Cat(String name, int legs, String sound) {
        super(name, legs);
        Sound = sound;
    }

    public String getSound() {
        return Sound;
    }

    public void setSound(String sound) {
        Sound = sound;
    }

    @Override
    public void printAnimal() {
        System.out.printf("The Cat's name is %s, it has %d legs and is making a %s sound.%n",
                getName(), getLegs(), Sound);
    }
}