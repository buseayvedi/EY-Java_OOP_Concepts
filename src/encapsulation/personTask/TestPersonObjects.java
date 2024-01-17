package encapsulation.personTask;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Hakan");
        Person person2 = new Person("Ayla",'F');
        Person person3 = new Person("Mustafa",32);
        Person person4 = new Person("Veysel","Turkish");
        Person person5 = new Person("Yeliz","Turkish",44);
        Person person6 = new Person("Sevil","Turkish",44,'F');

        person4.name = "Fuat";
        
        //person1.planet = "Mars";
        //Person.planet = "Mercury";

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        Person.printPlanetName();
        
        person4.eat("Baklava");
        person3.drink("Ayran");

        person5.drink("Tea");
        person6.drink("Coffee");
    }
}
