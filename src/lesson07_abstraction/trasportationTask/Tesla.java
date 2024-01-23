package lesson07_abstraction.trasportationTask;

public class Tesla extends Car implements Electric,AutoPilot{

    public Tesla(String make, String model, String color, int year, int price) {
        super(make, model, color, year, price);
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
}
