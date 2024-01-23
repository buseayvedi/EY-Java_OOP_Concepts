package abstraction.animalTask;

public class Tiger extends Animal implements WildAnimal{

    public Tiger(String breed, String name, String color, String size, int age, char gender) {
        super(breed, name, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Tiger "+getName()+" is eating deer");
    }

    @Override
    public void hunt() {

    }
}
