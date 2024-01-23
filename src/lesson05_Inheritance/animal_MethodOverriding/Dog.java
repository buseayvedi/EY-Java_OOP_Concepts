package lesson05_Inheritance.animal_MethodOverriding;

public class Dog extends Animal{

    public Dog(String breed, String name, String color, String size, int age, char gender) {
        super(breed, name, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Dog "+getName()+" is eating dog food");
    }

    public void bark(){
        System.out.println("Dog "+getName()+" is barking");
    }
}
