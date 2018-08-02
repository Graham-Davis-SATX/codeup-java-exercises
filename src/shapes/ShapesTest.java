package shapes;


//public class ShapesTest {
//
//    public static void main(String[] args) {
//
//        Rectangle box1 = new Rectangle(5.0, 4.0);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5.0);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
//    }
//}

/**Abstract*/

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape = new Square(5.0);
        Measurable myShape2 = new Rectangle(5.0, 4.0);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
    }
}