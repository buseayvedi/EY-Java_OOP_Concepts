package lesson03_accessModifiers;

public class StaticBlock_Vs_InstanceBlock_Vs_Constructor {

    public StaticBlock_Vs_InstanceBlock_Vs_Constructor(){
        System.out.println("Constructor");

    }

    {
        System.out.println("Instance Block");

    }

    static {

        System.out.println("Static Block");

    }

    public static void main(String[] args) {

        System.out.println("Main Method");

        new StaticBlock_Vs_InstanceBlock_Vs_Constructor();
        new StaticBlock_Vs_InstanceBlock_Vs_Constructor();
    }
}
