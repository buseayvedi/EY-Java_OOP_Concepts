package lesson03_accessModifiers;

public class InstanceBlock {

    {
        System.out.println("Instance Block");

    }

    public InstanceBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();
    }
}
