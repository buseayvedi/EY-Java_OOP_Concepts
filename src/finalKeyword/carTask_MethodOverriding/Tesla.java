package finalKeyword.carTask_MethodOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void setModel(String model) {
        ArrayList<String> valid = new ArrayList<>(Arrays.asList("Model S","Model Y","Model X","Model 3"));
        if(!valid.contains(model)){
            System.err.println("Model is not valid");
            System.exit(1);
        }
        super.setModel(model);// this.model = model;
    }

    @Override
    public void setColor(String color) {
        ArrayList<String> valid = new ArrayList<>(Arrays.asList("White","Red","Black","Silver","Blue","Brown","Green"));
        if(!valid.contains(color)){
            System.err.println("Color not valid");
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setYear(int year) {
        if(year < 2008){
            System.err.println("Year can't be less than 2008");
            System.exit(1);
        }
        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {
        if(price < 50000){
            System.err.println("Price can't be less than 50.000");
            System.exit(1);
        }
        super.setPrice(price);
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start "+getMake()+" "+getModel());
    }

    public void autoPilot(){
        System.out.println(getMake()+" "+getModel()+" is in self driving mode");
    }
}
