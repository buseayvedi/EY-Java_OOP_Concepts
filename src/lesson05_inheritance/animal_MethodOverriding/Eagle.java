package lesson05_inheritance.animal_MethodOverriding;

public class Eagle extends Animal{

    public Eagle(String breed, String name, String color, String size, int age, char gender) {
        super(breed, name, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+getName()+" is eating snake");
    }
}
