package abstraction.animalTask;

public class Eagle extends Animal implements Flyable,WildAnimal{

    public Eagle(String breed, String name, String color, String size, int age, char gender) {
        super(breed, name, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+getName()+" is eating snake");
    }

    @Override
    public void fly() {

    }

    @Override
    public void hunt() {

    }
}
