package lesson05_Inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {


        Student student = new Student("Lucy",'F', LocalDate.of(1990,5,16),'A',"A101");
        President president = new President("Daniel",'M',LocalDate.of(1980,12,1),LocalDate.of(2020,2,14));
        Teacher teacher = new Teacher("Emily",'F',LocalDate.of(1985,7,20),"T20","Biology Teacher",88000);

        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);
        System.out.println("-------------------------------------------------------------------------");
        student.study();
        president.lie();
        teacher.teach();

        System.out.println("-------------------------------------------------------------------------");

        student.eat("Baklava");
        teacher.eat("Kebab");
        president.eat("Donut");

        student.drink("Milk");
        teacher.drink("Tea");
        president.drink("Coffee");
    }
}
