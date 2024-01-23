package lesson08_Polymorphism;

import lesson05_Inheritance.phoneTask.Iphone;
import lesson05_Inheritance.phoneTask.Nokia;
import lesson05_Inheritance.phoneTask.Phone;
import lesson05_Inheritance.phoneTask.Samsung;

public class PolymorphismPractice3 {

    public static void main(String[] args) {

        Phone[] phones = {
                new Iphone("Iphone 11 Pro", "Large", "Black", 900),
                new Iphone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new Iphone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new Iphone("Iphone 12 Pro", "Large", "Black", 1200),
                new Iphone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new Iphone("Iphone 6", "Smalle", "Gold", 400),
                new Iphone("Iphone 7", "Smalle", "White", 500)
        };

        for (Phone each : phones) {
            System.out.println(each.getModel()+" - "+each.getColor()+" - "+each.getPrice());
        }
        System.out.println("-------------------------------------------------------------------------------------");

        int countIphone = 0, countSamsung = 0;
        for (Phone each : phones) {
            if(each instanceof Iphone){ // if the phone is iPhone
                countIphone++;
            } else if (each instanceof Samsung) {// if the phone is Samsung
                countSamsung++;
            }
        }
        System.out.println("countIphone = " + countIphone);
        System.out.println("countSamsung = " + countSamsung);


        System.out.println("--------------------------------------------------------------------------------------");

        for (Phone each : phones) {
            if(each instanceof Iphone || each instanceof Samsung){
                if(each.getPrice() >= 700){
                    System.out.println(each.getModel());
                }
            }
        }
    }
}
