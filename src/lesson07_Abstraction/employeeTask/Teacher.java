package lesson07_Abstraction.employeeTask;

public class Teacher extends Employee{

    public Teacher(String name, String jobTitle, String id, int age, char gender, double salary) {
        super(name, jobTitle, id, age, gender, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" "+" is teaching");
    }
}
