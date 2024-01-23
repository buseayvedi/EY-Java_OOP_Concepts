package lesson07_abstraction;

import java.time.LocalDate;

public class TestCydeoStudentObjects {

    public static void main(String[] args) {


        CydeoDevStudent student = new CydeoDevStudent("Daniel",'M', LocalDate.of(1989,11,1),"A1","zero to hero",2);

        System.out.println(student);

        student.eat();
        student.drink();
        student.sleep();
        student.breath();


    }
}
