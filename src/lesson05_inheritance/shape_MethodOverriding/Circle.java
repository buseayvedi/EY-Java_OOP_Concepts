package lesson05_inheritance.shape_MethodOverriding;

public class Circle extends Shape{

    private double radius ;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius*radius;
    }

    @Override
    public double perimeter() {
        return 2* 3.14 * radius;
    }

    @Override
    public void draw() {
        super.draw();
        for (double i = -radius; i <= radius; i++) {
            for (double j = -radius; j <= radius; j++) {
                if (i * i + j * j <= radius * radius) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", radius='" + radius + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
