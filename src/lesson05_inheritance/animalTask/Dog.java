package lesson05_inheritance.animalTask;

public class Dog extends Animal{ // Dog Is An animal

    //       child        parent
    //       subclass     superclass
    /*
    public void method(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(color);
        System.out.println(size);
        System.out.println(isAnimal);

        setInfo();
        eat();
        sleep();
        drink();
        toString();
        //bark();
    }
     */

    public void bark(){
        System.out.println(getName()+" is barking");
    }

}
/*
7 variables
5 methods
 */