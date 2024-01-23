package lesson07_abstraction.trasportationTask;

public class Audi extends Car implements AutoPark{

    public Audi(String make, String model, String color, int year, int price) {
        super(make, model, color, year, price);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
