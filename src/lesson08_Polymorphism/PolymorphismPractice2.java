package lesson08_Polymorphism;

import lesson07_Abstraction.employeeTask.*;

public class PolymorphismPractice2 {

    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Hamza", "QA", "A01", 32, 'M', 110000),
                new Developer("Lucy", "Java Developer", "A02", 27, 'F', 128000, "Java"),
                new Tester("George", "SDET", "A03", 28, 'M', 120000),
                new Developer("Yulia", "Software Developer", "A04", 23, 'F', 135000, "Python"),
                new Tester("Cihad", "SDET", "A05", 30, 'M', 105000),
                new Developer("Gulistan", "Web Developer", "A06", 26, 'F', 130000, "Python"),
                new Tester("Nora", "QE", "A07", 28, 'F', 120000),
                new Driver("Aaron", "Truck Driver", "D1", 48, 'M', 90000),
                new Developer("Diana", "Front-end Developer", "A08", 29, 'F', 140000, "C#"),
                new Tester("Tatiana", "SDET", "A09", 25, 'F', 130000),
                new Developer("Alena", "Back-end Developer", "A10", 26, 'F', 150000, "Java"),
                new Tester("Timur", "SDET", "A11", 29, 'M', 115000),
                new Teacher("James", "Math Teacher", "B1", 45, 'M', 75000),
                new Developer("Hasan", "Full Stack Developer", "A12", 26, 'F', 142000, "Java"),
                new Tester("Nataliia", "QE", "A13", 24, 'F', 125000),
                new Developer("Ermek", "Full Stack Developer", "A14", 26, 'M', 142000, "Java"),
                new Tester("Khashayar", "SDET", "A15", 30, 'M', 105000),
        };

        // 1: Print the name and job title of every employee
        for (Employee each : employees) {
            System.out.println(each.getName()+" : "+ each.getJobTitle());
        }
        System.out.println("---------------------------------------------------------------------------------");

        int countDevs = 0, countTesters=0, countDrivers = 0 , countTeacher = 0;

        for (Employee each : employees) {
            if(each instanceof Developer){ // if the employee is developer
                countDevs++;
            } else if (each instanceof Tester) {// if the employee is tester
                countTesters++;
            } else if (each instanceof Driver) {// if the employee is driver
                countDrivers++;
            } else  { // if the employee is teacher
                countTeacher++;
            }
        }
        System.out.println("countDevs = " + countDevs);
        System.out.println("countTesters = " + countTesters);
        System.out.println("countDrivers = " + countDrivers);
        System.out.println("countTeacher = " + countTeacher);

        System.out.println("---------------------------------------------------------------------------------------");

        for (Employee each : employees) {
            if(!(each instanceof Developer)){
                System.out.println(each.getName());
            }
        }
    }
}
