package lesson08_polymorphism;

import lesson07_abstraction.employeeTask.*;
import lesson05_inheritance.animalTask.Animal;
import lesson05_inheritance.animalTask.Dog;
import lesson05_inheritance.phoneTask.Nokia;
import lesson05_inheritance.phoneTask.Phone;
import lesson07_abstraction.trasportationTask.AutoPilot;
import lesson07_abstraction.trasportationTask.Electric;
import lesson07_abstraction.trasportationTask.Tesla;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        //Dog dog = new Dog();

        //Cat cat = new Dog();

        Animal animal = new Dog(); // implicit casting

        System.out.println("---------------------------------------------------------------------------");

        Animal animal1 = new Dog(); // upcasting ==> Polymorphism
        animal1.setInfo("Max","Husky","White",'M','L',4);

        animal1.eat("Dog food");
        animal1.drink("Milk");
        animal1.sleep();
        ((Dog)animal1).bark(); // down casting

        // Dog dog1 = (Dog) animal1; // down casting
        // dog1.bark();

        // ((Cat)animal1).scratch(); // Dog can't be converted to Cat , because there is no "IS A" relationship between Cat and Dog


        System.out.println("-------------------------------------------------------------------------------------------");

        Phone phone = new Nokia("XR20","Small","Blue",350);

        phone.call(911);
        phone.text(123526);
        ((Nokia)phone).selfDefence();

        // ((Iphone)phone).faceTime(1235684); Nokia can't be converted to Iphone , because there is not "IS A" relationship between Iphone and Nokia

        System.out.println("---------------------------------------------------------------------------------------------");

        Employee employee = new Developer("Lucy","Java Developer","A1",30,'F',80000,"Java");

        employee.work();
        System.out.println(((Developer) employee).getProgrammingLanguage());

        //Driver driver = (Driver)employee;

        System.out.println("------------------------------------------------------------------------------");

        Electric electric = new Tesla("Tesla","Model Y","Blue",2020,5500);

        electric.charge();
        //electric.selfDrive();
        ((Tesla)electric).selfDrive();
        ((AutoPilot)electric).selfDrive();

        System.out.println("-----------------------------------------------------------------------------------");

        Employee employee1 = new Teacher("James","Math Teacher","B1",45,'M',75000);
        Employee employee2 = new Developer("Lucy","Java Developer","C1",30,'F',95000,"Java");
        Employee employee3 = new Driver("Aaron","Truck Driver","D1",48,'M',90000);
        Employee employee4 = new Tester("Emily","Manuel Tester","E1",35,'F',80000);

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();
    }
}
