package lesson03_accessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;

    /*
    {
        name = "George";
        age = 32;
    }

     */

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

 /*
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock();
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock();

        System.out.println(obj1.name);
        System.out.println(obj2.name);

  */

        InstanceInitializationBlock obj = new InstanceInitializationBlock("Roberto",44);
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Ariana",45);

        System.out.println(obj.name);
        System.out.println(obj2.name);
    }
}
