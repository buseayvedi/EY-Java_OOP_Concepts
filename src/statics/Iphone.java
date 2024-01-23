package statics;

public class Iphone {

    public static String brand = "Apple"; // Apple is the brand of all the iPhone objects
    public static String os = "iOS"; // all iPhones has iOS operating system
    public String model ; // instance : different models for iphone objects
    public String color ;
    public double price;
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExpensiveToFix = true;

   /* public static void printPhoneInfo(){ // static only accepts statics
        System.out.println("Model : "+ model);
        System.out.println("Color : "+ model);
    } */

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printPhoneInfo(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Color : "+color);
        System.out.println("Price : "+price);
    }
    public static void printOperatingSystem(){

        System.out.println("Operating System: "+os);
    }
}
/*
brand, model, color,price, OS , madeIn;
 */