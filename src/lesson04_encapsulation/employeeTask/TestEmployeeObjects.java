package lesson04_encapsulation.employeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {
/*
        Employee employee1 = new Employee();
        //employee1.salary = -200000;

        employee1.setSalary(100000);
        System.out.println(employee1.getSalary());

        //employee1.setName("      ");
        System.out.println(employee1.getName());
 */
        Employee employee1 = new Employee("Jeffrey",30,"Developer",120000);
        System.out.println(employee1);
    }
}
