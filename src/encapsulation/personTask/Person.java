package encapsulation.personTask;

public class Person {

    public String name, language;
    public int age;
    public char gender;
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    public Person(String name){
        this.name = name;
    }
    public Person(String name , char gender){
        this(name);
        this.gender = gender;
    }
    public Person(String name, int age){
        this(name);
        this.age = age;
    }
    public Person(String name, String language){
        this(name);
        this.language = language;
    }
    public Person(String name, String language, int age){
        this(name,language);
        this.age = age;
    }
    public Person(String name, String language, int age,char gender){
        this(name,language,age);
        this.gender = gender;
    }
    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHead = 1;
        numberOfWings = 0;
    }
    public static void printPlanetName(){
        System.out.println("Planet :"+planet);
    }
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet=" + planet +
                ", is human=" + isHuman +
                ", has nose=" + hasNose +
                ", number of head=" + numberOfHead +
                ", number of wings=" + numberOfWings +
                '}';
    }
}
