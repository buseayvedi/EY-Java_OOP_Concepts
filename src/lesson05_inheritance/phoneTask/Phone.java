package lesson05_inheritance.phoneTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Phone {

    private String brand, model, size, color;
    private int price;

    public Phone(String brand, String model, String size, String color, int price) {
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
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black", "White", "Silver", "Gold", "Pink","Blue","Gray"));
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
}
