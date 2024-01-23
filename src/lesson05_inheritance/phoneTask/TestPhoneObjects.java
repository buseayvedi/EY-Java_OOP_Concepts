package lesson05_inheritance.phoneTask;

public class TestPhoneObjects {

    public static void main(String[] args) {


        Iphone iPhone = new Iphone("iPhone 12","Large","Gold",1200);
        Samsung samsung = new Samsung("Galaxy S22","Medium","Pink",1100);
        Nokia nokia = new Nokia("3210","Small","White",50);

        iPhone.call(1236547898L);
        samsung.call(12574563652L);
        nokia.call(8235874561L);

        System.out.println("----------------------------------------------------------------------");

        iPhone.faceTime("emiryaziciofficial@gmail.com");
        iPhone.faceTime(6542369874L);
        //samsung.faceTime(1256358974L);
        //nokia.faceTime("abilubulubu@yahoo.com");

        samsung.freeze();
        //iPhone.freeze();
        //nokia.freeze();

        nokia.selfDefence();
        //iPhone.selfDefence();
        //samsung.selfDefence();

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(nokia);
    }
}
