package lesson07_abstraction.employeeTask;

public class Tester extends Employee{

    public Tester(String name, String jobTitle, String id, int age, char gender, double salary) {
        super(name, jobTitle, id, age, gender, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is testing the software");
    }
}
