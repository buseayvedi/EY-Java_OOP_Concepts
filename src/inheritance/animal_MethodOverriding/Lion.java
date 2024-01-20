package inheritance.animal_MethodOverriding;

public class Lion extends Animal{

    private boolean isAfricanLion;

    public Lion(String breed, String name, String color, String size, int age, char gender, boolean isAfricanLion) {
        super(breed, name, color, size, age, gender);
        setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+" is eating deer");
    }

    public void roar(){
        System.out.println("Lion "+getName()+" is roaring");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+ ", is African lion='"+ isAfricanLion + '\''+'}';
    }
}
