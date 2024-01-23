package constructor;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person("Emir",33,'M', LocalDate.of(1990,5,31),false,true);

        p1.eat("tiramisu");
        p1.drink("tea");
        p1.sleep();
        System.out.println(p1);
    }
}
