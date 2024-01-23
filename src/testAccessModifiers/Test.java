package testAccessModifiers;

import lesson03_AccessModifiers.AccessModifiers;
import lesson03_AccessModifiers.Data;

public class Test {

    public static void main(String[] args) {


        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data data = new Data();

        System.out.println(data.a);
        System.out.println(data.b);
        System.out.println(data.c);

        data.method1();
        data.method2();


        System.out.println(AccessModifiers.publicData);// public is always accessible in different packages

        // System.out.println(AccessModifiers.protectedData); // protected is NOT always accessible in different packages

        // System.out.println(AccessModifiers.defaultData); // default is NEVER accessible in different packages

        // System.out.println(AccessModifiers.privateData); // private is NEVER accessible in different packages

        new AccessModifiers();

        AccessModifiers.publicMethod();
        //AccessModifiers.protectedMethod();
        //AccessModifiers.defaultMethod();
        //AccessModifiers.privateMethod();
    }
}
