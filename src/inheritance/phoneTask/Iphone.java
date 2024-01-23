package inheritance.phoneTask;

public class Iphone extends Phone {

    public static boolean hasApplePay = true;

    public Iphone(String model, String size, String color, int price) {
        super("Apple", model, size, color, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println("Apple "+getModel()+" is face timing with "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println("Apple "+getModel()+" is face timing with "+email);
    }

}
