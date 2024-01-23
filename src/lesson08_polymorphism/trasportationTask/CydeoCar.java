package lesson08_polymorphism.trasportationTask;

import lesson07_abstraction.animalTask.Flyable;
import lesson07_abstraction.animalTask.Swimmable;

public class CydeoCar extends Car implements Flyable,Electric,AutoPilot, Swimmable {

    public CydeoCar(String make, String model, String color, int year, int price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void swim() {

    }
}
