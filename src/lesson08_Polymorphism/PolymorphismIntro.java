package lesson08_Polymorphism;

import lesson07_Abstraction.animalTask.*;
import lesson07_Abstraction.carTask.Audi;
import lesson07_Abstraction.carTask.Honda;
import lesson07_Abstraction.carTask.Tesla;
import lesson07_Abstraction.employeeTask.*;
import lesson05_Inheritance.shape_MethodOverriding.Circle;

import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Dog dog = new Dog("Husky","Max","White","Small",4,'M');
        Cat cat = new Cat("Stray","Osman","Black","Small",2,'M');

        Dolphin dolphin = null;
        Duck duck = null;
        Eagle eagle = null;
        Lion lion = null;
        Parrot parrot = null;
        Shark shark = null;
        Tiger tiger = null;

        Animal[] animals = {dog,cat,dolphin,duck,eagle,lion,parrot,shark,tiger};

        // Animal animal = new Tesla("Model Y", "Blue", 2022, 60000);
        // there is no "IS A" relationship between Tesla and Animal

        Animal animal = new Dog("Husky","Max","White","Small",4,'M');

        animal.eat();
        animal.drink();
        animal.sleep();

        // animal.play();
        // animal.bark();

        System.out.println("------------------------------------------------------------");

        String str = "Java";
        Integer n = 100 ;
        Boolean r = false;
        Double d = 10.5;
        Circle circle = new Circle(4);
        Honda honda = new Honda("Pilot","Black",2019,35000);
        Audi audi = new Audi("Q6","Silver",2020,36000);
        Tesla tesla = new Tesla("Model Y","Blue",2022,60000);
        Teacher teacher = new Teacher("James","Math Teacher","B1",45,'M',75000);
        Developer developer = new Developer("Lucy","Java Developer","C1",30,'F',95000,"Java");
        Driver driver = new Driver("Aaron","Truck Driver","D1",48,'M',90000);
        Tester tester = new Tester("Emily","Manuel Tester","E1",35,'F',80000);

        Object[] objects = {str,n,r,d,circle,honda,audi,tesla,teacher,developer,driver,tester};

        System.out.println(Arrays.toString(objects));

        Object[] employees = {teacher,developer,driver,tester};


        Employee obj = new Driver("Aaron","Truck Driver","D1",48,'M',90000);

        obj.work();

    }
}
