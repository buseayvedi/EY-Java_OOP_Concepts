package lesson07_Abstraction.animalTask;

public class Shark extends Animal implements WildAnimal, Swimmable{

    public Shark(String breed, String name, String color, String size, int age, char gender) {
        super(breed, name, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Shark "+getName()+" is eating fish");
    }

    @Override
    public void hunt() {

    }

    @Override
    public void swim() {

    }
}
