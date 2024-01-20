package inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husky","White",'M','L',4);

        Cat cat = new Cat();
        cat.setInfo("Felicia","Stray","Black",'F','M',3);

        Tiger tiger = new Tiger();
        tiger.setInfo("Shere Khan","Bengal","Orange",'M','L',5);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("------------------------------------------------------------------------");

        dog.eat("Dog Food");
        dog.sleep();
        dog.drink("Water");

        cat.eat("Cat Food");
        cat.sleep();
        cat.drink("Water");

        tiger.eat("Snake");
        tiger.sleep();
        tiger.drink("Water");

        dog.bark();
        cat.meow();
        cat.scratch();
        tiger.hunt();

        /*
        cat.bark();
        tiger.bark();
        dog.meow();
        tiger.meow();
        dog.hunt();
        cat.hunt();

         */

    }
}
