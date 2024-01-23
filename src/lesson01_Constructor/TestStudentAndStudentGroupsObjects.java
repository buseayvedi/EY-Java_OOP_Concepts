package lesson01_Constructor;

import lesson01_Constructor.Student;
import lesson01_Constructor.StudentsGroups;

public class TestStudentAndStudentGroupsObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Yusuf",21,'M',"A16");
        Student student2 = new Student("Necla",43,'F',"B34");
        Student student3 = new Student("Arif",27,'F',"C56");
        Student student4 = new Student("Zuleyha",61,'F',"D43");
        Student student5 = new Student("Kebire",55,'F',"E27");

        Student[] students = {student2,student3,student4,student5};

        StudentsGroups group1 = new StudentsGroups("Java Turtles",1);

        group1.addStudent(student1);
        group1.addStudent(students);

        group1.addStudent("Khashayar",34,'M',"F35");

        group1.removeStudent("D43");
        group1.removeStudent("E27");

        System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name+ " : "+each.id);
        }
    }
}
