package lesson02_Statics;

public class StaticBlock {

    public StaticBlock(){

        System.out.println("Constructor");
    }

    public StaticBlock(String str){
        System.out.println("Constructor 2");
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
