import java.io.*;
import java.util.Scanner;

public class MethodsExercises {

    public static int addTwoInt(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int subTwoInt(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public static int multiTwoInt(int a, int b) {
        // int multi = a * b;
        // return multi;
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = result + a;
        }
        return result;
    }

    public static float divTwoInt(float a, float b) {
        // float div = a / b;
        // return div;
        int result = 0;
        while (a >= b) {
            a = a - b;
            result = result + 1;
        }
        return result;
    }

    public static int modTwoInt(int a, int b) {
        int mod = a % b;
        return mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in)); int no =0;

//        System.out.println("We\'re going to perform mathematical operations on two numbers, but we need you to supply the two numbers.");
//        System.out.println("Please enter the first number you'd like to use: ");
//        int a = Integer.parseInt(sc.nextLine());
//        System.out.println("Please enter the second number you'd like to use: ");
//        int b = Integer.parseInt(sc.nextLine());
//        System.out.println("When you add " + "'" + a + "'" + " to " + "'" + b + "'" + " the result is: " + addTwoInt(a, b));
//        System.out.println("When you subtract " + "'" + b + "'" + " from " + "'" + a + "'" + " the result is: " + subTwoInt(a, b));
//        System.out.println("When you multiply " + "'" + a + "'" + " and " + "'" + b + "'" + " the result is: " + multiTwoInt(a, b));
//        System.out.println("When you divide " + "'" + a + "'" + " by " + "'" + b + "'" + " the result is: " + divTwoInt(a, b));
//        System.out.println("When you divide " + "'" + a + "'" + " by " + "'" + b + "'" + " you\'ll have a remainder of: " + modTwoInt(a, b));

    } // end main

}