package statics;

public class Car {

    public String make, model, color ;
    public int year;
    public double price;

    public Car(String make){
        this.make = make;
    }
    public Car(String make , String model){
        this(make);
        this.model = model;
    }
    public Car(String make , String model, String color){
        this(make, model);
        this.color = color;
    }
    public Car(String make, String model, String color, int year){
        this(make, model, color);
        this.year = year;
    }
    public Car (String make, String model, String color, int year, double price){
        this(make, model, color, year);
        this.price = price;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
class name: Car
		 instance variables:
		 		make, model, year, price, color

	 		1st constructor: initializes the make ONLY

	 		2nd constructor: initializes make & model
	 				(MUST use constructor call to set the make)

			3rd constructor: initializes make, model, year
					(MUST use constructor call to set the make, model)

			4th constructor: initializes make, model, year, price
					(MUST use constructor call to set the make, model, year)

			5th Constructor: initializes all the instances
					(MUST use constructor call to set the make, mode, year, price, color)


		instance methods: toString

 */