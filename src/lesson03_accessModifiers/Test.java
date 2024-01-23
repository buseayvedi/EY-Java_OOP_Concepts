package lesson03_accessModifiers;

public class Test {


    public static void main(String[] args) {

        // new StaticInitializationBlock();
        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);


        System.out.println("------------------------------------------------------------------------");

        System.out.println(AccessModifiers.publicData); // public is accessible within same package
        System.out.println(AccessModifiers.protectedData); // protected is accessible withing same package
        System.out.println(AccessModifiers.defaultData); // default is accessible withing same package
        //System.out.println(AccessModifiers.privateData); // private is NOT accessible outside the class

        new AccessModifiers();

        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        //AccessModifiers.privateMethod();
    }
}
