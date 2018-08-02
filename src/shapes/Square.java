package shapes;

//public class Square extends Rectangle {
//
//    public Square(double side) {
//        super(side, side);
//    }
//
//    @Override
//    public double getArea() {
//        System.out.println("overWrote");
//        return 4 * super.length;
//    }
//
//    @Override
//    public double getPerimeter() {
//        System.out.println("overWrote");
//        return Math.pow(super.length, 2);
//    }
//}

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double side) {
        super.length = side;
    }

    @Override
    public void setWidth(double side) {
        super.width = side;
    }

    @Override
    public double getPerimeter() {
        return super.length * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(super.width, 2);
    }
}
