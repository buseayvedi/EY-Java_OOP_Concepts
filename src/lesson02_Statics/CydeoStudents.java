package lesson02_Statics;

public class CydeoStudents {

    public String name;
    public int age;
    public char gender;

    public static String schoolName = "Cydeo";
    public static String secretCode = "Wooden Spoon";

    public CydeoStudents(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
//    static {
//        schoolName = "Cydeo";
//        secretCode = "Wooden Spoon";
//    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", school name=" + schoolName +
                ", secret code=" + secretCode +
                '}';
    }
}
