package polymorphism.trasportationTask;

import abstraction.animalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable {

    public Plane(String make, String model, String color, int year, int price) {
        super(make, model, color, year, price);
    }

    public void land(){
        System.out.println(getMake()+" "+getModel()+" is landing");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+" "+getModel()+" is flying");
    }
}
