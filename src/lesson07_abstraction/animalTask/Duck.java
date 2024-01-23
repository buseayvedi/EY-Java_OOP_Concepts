package lesson07_abstraction.animalTask;

public class Duck extends Animal implements Playable,Flyable,Swimmable{

    public Duck(String breed, String name, String color, String size, int age, char gender) {
        super(breed, name, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+getName()+" is eating worm");
    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
