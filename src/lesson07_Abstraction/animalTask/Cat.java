package lesson07_Abstraction.animalTask;

public class Cat extends Animal implements Playable{

    public Cat(String breed, String name, String color, String size, int age, char gender) {
        super(breed, name, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Cat "+getName()+" is eating cat food");
    }

    @Override
    public void play() {

    }
}
