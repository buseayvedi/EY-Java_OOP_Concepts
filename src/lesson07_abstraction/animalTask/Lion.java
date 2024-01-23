package lesson07_abstraction.animalTask;

public class Lion extends Animal implements WildAnimal{

    public Lion(String breed, String name, String color, String size, int age, char gender) {
        super(breed, name, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+" is eating antelope");
    }

    @Override
    public void hunt() {

    }
}
