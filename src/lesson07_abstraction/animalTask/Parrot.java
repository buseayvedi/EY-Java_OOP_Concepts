package lesson07_abstraction.animalTask;

public class Parrot extends Animal implements Playable,Flyable{

    public Parrot(String breed, String name, String color, String size, int age, char gender) {
        super(breed, name, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Parrot "+getName()+" is eating sunflower seed");
    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {

    }
}
