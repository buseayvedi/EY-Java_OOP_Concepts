package Constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name, jobTitle;
    public int age;
    public double salary;
    public char gender;
    public LocalDate hiredDate;

    public Employee(String name,int age, char gender, String jobTitle,  double salary, LocalDate hiredDate) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.hiredDate = hiredDate;
    }// allows us to set all the instance variables of the objects as soon as the object created

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                ", hiredDate=" + hiredDate.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                '}';
    }// allows us to print the object when it passed in the print statement
}
/*
name
age
gender
jobTitle
salary
hiredDate
 */