package statics;

public class TestCarObjects {

    public static void main(String[] args) {


        Car car1 = new Car("BMW");

        System.out.println(car1);

        Car car2 = new Car("Audi","Q4");

        System.out.println(car2);

        Car car3 = new Car ("Toyota","Camry","Red");

        System.out.println(car3);

        Car car4 = new Car("Honda","Accord","Black",2023);

        System.out.println(car4);

        Car car5 = new Car("Lexus","RX350","Blue",2019,24600);

        System.out.println(car5);
    }
}
