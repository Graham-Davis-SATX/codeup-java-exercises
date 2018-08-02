package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        System.out.println("overWrote");
        return 4 * super.length;
    }

    @Override
    public double getPerimeter() {
        System.out.println("overWrote");
        return Math.pow(super.length, 2);
    }
}
