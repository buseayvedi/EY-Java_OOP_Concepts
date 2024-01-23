package lesson05_Inheritance.animal_MethodOverriding;

public class Animal {

    private String breed, name, color, size ;
    private int age;
    private char gender;

    public Animal(String breed, String name, String color, String size, int age, char gender) {
        setBreed(breed);
        setName(name);
        setColor(color);
        setSize(size);
        setAge(age);
        setGender(gender);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void drink(){
        System.out.println(name+" is drinking water");
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void sleep(){
        System.out.println(name+" sleeps 8 hours a day");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
