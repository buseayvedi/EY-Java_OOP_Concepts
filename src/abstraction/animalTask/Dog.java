package abstraction.animalTask;

public class Dog extends Animal implements Playable{

    public Dog(String breed, String name, String color, String size, int age, char gender) {
        super(breed, name, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Dog "+getName()+" is eating dog food");
    }

    @Override
    public void play() {

    }

    public void bark(){
        System.out.println("Dog "+getName()+" is barking");
    }
}
