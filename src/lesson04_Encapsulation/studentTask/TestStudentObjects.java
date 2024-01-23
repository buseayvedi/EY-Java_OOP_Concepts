package lesson04_Encapsulation.studentTask;

public class TestStudentObjects {

    public static void main(String[] args) {

        Student student = new Student();

        //student.age = -200;

        //System.out.println(student.age);

        student.setAge(10);

        //student.name = " Aaron";

        System.out.println(student.getAge());

        //student.setName("Aaron113");

        System.out.println(student.getName());
    }
}
