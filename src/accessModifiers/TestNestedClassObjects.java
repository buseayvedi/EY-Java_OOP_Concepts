package accessModifiers;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        Car obj1 = new Car(); // car object

        Car.CarEngine obj2 = obj1.new CarEngine(); // carEngine object

        Car.StaticInnerClass obj3 = new Car.StaticInnerClass();
    }
}
