package lesson07_Abstraction.employeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        //Employee employee = new Employee("Daniel","SDET","A1",54,'M',85000);
        // We can't create objects from an abstract class. Object MUST be created from a concrete class.

        Teacher teacher = new Teacher("James","Math Teacher","B1",45,'M',75000);
        Developer developer = new Developer("Lucy","Java Developer","C1",30,'F',95000,"Java");
        Driver driver = new Driver("Aaron","Truck Driver","D1",48,'M',90000);
        Tester tester = new Tester("Emily","Manuel Tester","E1",35,'F',80000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);

        System.out.println("--------------------------------------------------------------------------------");

        teacher.work();
        developer.work();
        driver.work();
        tester.work();
    }
}
