package lesson07_abstraction.animalTask;

public class Dolphin extends Animal implements Playable,Swimmable{

    public Dolphin(String breed, String name, String color, String size, int age, char gender) {
        super(breed, name, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin "+getName()+" is fish");
    }

    @Override
    public void play() {

    }

    @Override
    public void swim() {

    }
}
