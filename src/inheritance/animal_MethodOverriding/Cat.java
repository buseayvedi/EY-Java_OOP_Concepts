package inheritance.animal_MethodOverriding;

public class Cat extends Animal{

    public Cat(String breed, String name, String color, String size, int age, char gender) {
        super(breed, name, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Cat "+getName()+" is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cat "+getName()+" sleeps 12 hours a day");
    }

    public void scratch(){
        System.out.println("Cat "+getName()+" is scratching");
    }
}
