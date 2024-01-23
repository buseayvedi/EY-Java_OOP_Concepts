package lesson04_Encapsulation.employeeTask;

public class Employee {
    private String name;
    private int age;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
    }
    public double getSalary() { // read
        return salary;
    }
    public void setSalary(double salary) { // write
        if(salary < 0){
            System.err.println("Salary can't be negative");
            System.exit(1);
        }
        this.salary = salary;
    }
    public String getName() {
        if(name == null){
            name = "Unknown";
        }
        return name;
    }
    public void setName(String name) {
        if(name.trim().isEmpty()){
            System.err.println("Name can't be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age < 16){
            System.err.println("Age can't be less than 16");
            System.exit(1);
        }
        this.age = age;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        if(jobTitle.trim().isEmpty()){
            System.err.println("Job title can't be blank or empty");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
