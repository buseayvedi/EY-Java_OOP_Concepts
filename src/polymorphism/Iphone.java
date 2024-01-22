package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class Iphone {

    private String brand, model, size, color;
    private int price;

    public Iphone(String brand, String model, String size, String color, int price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black", "White", "Silver", "Gold", "Pink", "Blue", "Gray"));
        if (!colors.contains(color)) {
            System.err.println("Invalid color");
            System.exit(1);
        }
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.err.println("Price can't be negative");
            System.exit(1);
        }
        this.price = price;
    }

    public void call(long phoneNumber) {
        System.out.println(brand + " " + model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(brand + " " + model + " is texting " + phoneNumber);
    }

    public String toString() {
        return getClass().getSimpleName() + '{' +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Iphone)){ // if the given object is not iphone
            System.err.println("Invalid object");
            System.exit(1);
        }
        if (model.equals(((Iphone) obj).model)) { // if the model of the iphone is equal to the given object's model
            if (color.equals(((Iphone)obj).color)){ // if the color of the iphone is equals to the given object's color
                return true;
            }
        }
        return false;
    }
}
