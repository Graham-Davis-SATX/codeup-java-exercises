/*
import javax.swing.*;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class MethodsExercise_2 {

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


//    // Validate that the entered integer is a positive integer
//        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//        int no = 0;
//        System.out.println("Enter a number");
//        no = Integer.parseInt(reader.readLine());
//        while(no < 0) {
//            System.out.println("Dude I need a positive number here");
//            no = Integer.parseInt(reader.readLine());
//        }
//        System.out.println(no);

        // Arithmetic Operations
        System.out.println("We\'re going to perform mathematical operations on two numbers, but we need you to supply the two numbers.");
        System.out.println("Please enter the first number you'd like to use: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter the second number you'd like to use: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("When you add " + "'" + a + "'" + " to " + "'" + b + "'" + " the result is: " + addTwoInt(a, b));
        System.out.println("When you subtract " + "'" + b + "'" + " from " + "'" + a + "'" + " the result is: " + subTwoInt(a, b));
        System.out.println("When you multiply " + "'" + a + "'" + " and " + "'" + b + "'" + " the result is: " + multiTwoInt(a, b));
        System.out.println("When you divide " + "'" + a + "'" + " by " + "'" + b + "'" + " the result is: " + divTwoInt(a, b));
        System.out.println("When you divide " + "'" + a + "'" + " by " + "'" + b + "'" + " you\'ll have a remainder of: " + modTwoInt(a, b));


        // Number Chcker
        System.out.println("Please enter a number between \'1\' and \'10\':");
        int number = Integer.parseInt(sc.nextLine());
        int bot = 0;
        int top = 10;

        if (rangeCheck(number, bot, top)) {
            JOptionPane.showMessageDialog(null,  number + " is a valid number.");
        } else {
            JOptionPane.showMessageDialog(null, number + " is NOT a valid number.");
        }

    } // end main

    public static boolean rangeCheck(int num, int min, int max) {
        return num > min && num < max;
    }



    public static void diceRoll(){
        boolean userCont = true;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        while(userCont){
            System.out.println("How many sides on the dice? ");
            int sides = sc.nextInt();
            int roll1 = rand.nextInt(sides);
            int roll2 = rand.nextInt(sides);
            System.out.println("Roll 1: " + (roll1 + 1));
            System.out.println("Roll 2: " + (roll2 + 1));
            System.out.println("Do you want to roll again? 'Y' or 'N' " );
            String userAnswer = sc.next();
            if(userAnswer.equals("N")){
                userCont = false;
            }
        }
*/
