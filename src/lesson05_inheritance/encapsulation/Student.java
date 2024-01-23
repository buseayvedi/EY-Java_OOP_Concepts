package lesson05_inheritance.encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getName(){ //read only
        if(name == null){
            name = "Unknown";
        }
        return name;
    }
    public void setName(String name){ // write only
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
        if(age < 0){
            System.err.println("Age can't be negative");
            System.exit(1);
        }
        if(age < 5 || age > 90){
            System.err.println("Age can't be less than 5 and greater than 90");
            System.exit(1);
        }
        this.age = age;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        if(gender == 'M' || gender == 'F'){
            this.gender = gender;
        }else{
            System.err.println("Gender should be 'M' OR 'F' ");
            System.exit(1);
        }

    }
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        if(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F'){
            this.grade = grade;
        }else{
            System.err.println("Grade can't be other than A,B,C,D,F ");
            System.exit(1);
        }

    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name+" is studying at "+schoolName);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
