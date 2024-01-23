package lesson05_inheritance.animal_MethodOverriding;

public class TestAnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Bengle","Emily","Gray","Small",4,'F');
        Dog dog = new Dog("Husky","Max","White","Large",3,'M');
        Lion lion = new Lion("African Lion","Simba","Yellow","Large",6,'M',true);
        Eagle eagle = new Eagle("African Eagle","Bella","Black & White","Medium",4,'F');

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("------------------------------------------------------------------------");

        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();

        System.out.println("--------------------------------------------------------------------------");

        cat.sleep();
        dog.sleep();
        lion.sleep();
        eagle.sleep();

        System.out.println("----------------------------------------------------------------------------");

    }
}
