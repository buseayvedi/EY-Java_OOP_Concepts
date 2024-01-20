package inheritance.encapsulation;

public class TestStudentObjects {

    public static void main(String[] args) {


        Student student1 = new Student("Emanuel",23,'M','B',"MIT");
        System.out.println(student1);
        student1.setSchoolName("Harvard");
        System.out.println(student1.getSchoolName());
        System.out.println(student1);
        student1.setGrade('A');
        System.out.println(student1.getGrade());
        System.out.println(student1);
    }
}
