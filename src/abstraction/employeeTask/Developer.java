package abstraction.employeeTask;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, String jobTitle, String id, int age, char gender, double salary, String programmingLanguage) {
        super(name, jobTitle, id, age, gender, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getName()+" is coding in "+programmingLanguage);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", id='" +getId() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", salary=" + getSalary() +
                ", programming language=" + programmingLanguage +
                '}';
    }
}
