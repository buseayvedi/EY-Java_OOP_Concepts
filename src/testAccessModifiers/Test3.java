package testAccessModifiers;

import lesson05_Inheritance.ProtectedAccessModifier;

public class Test3 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        System.out.println(ProtectedAccessModifier.a);
        ProtectedAccessModifier.method1();

    }
}
