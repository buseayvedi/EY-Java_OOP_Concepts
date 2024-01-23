package lesson02_statics;

public class ConstructorCalls2 {

    public ConstructorCalls2(){// Default

        System.out.println("Default");
    }
    public ConstructorCalls2(int a){ // Default , int arg
        this(); // calling the default constructor
        System.out.println("int arg");
    }
    public ConstructorCalls2(String a){ // Default , int arg ,String arg
        this(9);// calling the constructor with int arg
        System.out.println("String arg");
    }

    public static void main(String[] args) {

        ConstructorCalls2 obj1 = new ConstructorCalls2();

        System.out.println("------------------------------------------------------------");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10);

        System.out.println("-------------------------------------------------------------");

        ConstructorCalls2 obj3 = new ConstructorCalls2("Java");
    }
}
