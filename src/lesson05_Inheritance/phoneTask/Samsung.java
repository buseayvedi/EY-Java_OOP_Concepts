package lesson05_Inheritance.phoneTask;

public class Samsung extends Phone {

    public Samsung(String model, String size, String color, int price) {
        super("Samsung", model, size, color, price);
    }

    public void freeze(){
        System.out.println(getBrand()+" "+getModel()+" is freezes");
    }
}
