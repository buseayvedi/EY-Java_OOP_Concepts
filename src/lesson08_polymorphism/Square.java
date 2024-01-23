package lesson08_polymorphism;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Square){
            if (((Square) obj).side == side){
                return true;
            }
        }else{
            System.err.println("Invalid object");
            System.exit(1);
        }
        return false;
    }
}
