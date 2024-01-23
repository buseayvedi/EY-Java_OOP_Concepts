package lesson03_AccessModifiers;

public class StaticBlock {

    public StaticBlock(){

        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        System.out.println("Main method");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }
    static {

        System.out.println("Static Block");
    }
}
