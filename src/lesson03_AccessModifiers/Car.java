package lesson03_AccessModifiers;

public class Car { // Outer class

    public String make, model, color;
    public int year;
    public double price;

    public static int numberOfwheels = 4;

    public class CarEngine { // Inner Class

        public void method() {
            System.out.println(make);
            System.out.println(numberOfwheels);

        }

    }

    public static class StaticInnerClass{ // static only accepts static

        public void method(){
            //System.out.println(make);
            System.out.println(numberOfwheels);

        }
    }
}
