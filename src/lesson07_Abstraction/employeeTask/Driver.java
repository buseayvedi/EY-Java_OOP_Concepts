package lesson07_Abstraction.employeeTask;

public class Driver extends Employee{

    public Driver(String name, String jobTitle, String id, int age, char gender, double salary) {
        super(name, jobTitle, id, age, gender, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving");
    }
}
