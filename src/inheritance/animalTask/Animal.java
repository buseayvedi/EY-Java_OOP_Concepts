package inheritance.animalTask;

public class Animal {

    private String name, breed, color;
    private char gender, size;
    private int age;
    public static boolean isAnimal;

    static {
        isAnimal = true;
    }
    public void setInfo(String name, String breed, String color, char gender, char size, int age) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setGender(gender);
        setSize(size);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(String food) {
        System.out.println(name + " is eating "+food);
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking "+drink);
    }

    public String toString() {
        return getClass().getSimpleName() +'{'+
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                ", is animal=" + isAnimal +
                '}';
    }
}
