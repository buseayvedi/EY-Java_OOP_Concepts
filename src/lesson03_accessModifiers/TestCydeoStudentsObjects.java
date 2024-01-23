package lesson03_accessModifiers;

public class TestCydeoStudentsObjects {

    public static void main(String[] args) {

        CydeoStudents student1 = new CydeoStudents("Ali",22,'M');
        CydeoStudents student2 = new CydeoStudents("Naciye",21,'F');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);

    }
}
