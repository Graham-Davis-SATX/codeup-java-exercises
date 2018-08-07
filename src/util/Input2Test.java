package util;

public class Input2Test {
    public static void main(String[] args) {
        Input input = new Input();
        input.getDouble(1.25, 1.75);
        System.out.println("before transform");
        System.out.println(input.getInt());
        System.out.println("after the transform");
    }
}