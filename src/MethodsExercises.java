import java.util.Scanner;
import java.util.Random;
public class MethodsExercises {
    public static void main(String[] args){
//        double addition = addition(-4, 5);
//        double subtraction = subtraction(5, 10);
//        double multiplication = multiplication(3, 3);
//        double division = division(12, 1.5);
//        System.out.println(addition);
//        System.out.println(subtraction);
//        System.out.println(multiplication);
//        System.out.println(division);
//        double recursion = multiply(4, 5);
//        System.out.println(recursion);
//        System.out.println("Enter a number between 1-10");
//        int userNumber = getInteger(1, 10);
//        System.out.println(userNumber);
//        factorial();
//        diceRoll();
        guess();
//       countVowels("AaBbEeIiOoUu");
//        countAs("aaaa");
//        calculator();

    }
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static double multiplication(double num1, double num2){
        double num = num2;
        for(int i = 0; i < num1 - 1; i++){

            num2 += num;
//            System.out.println(num2);
//            System.out.println(i);
        }
        System.out.println(num2);
        return num2;
    }
    public static double multiply(double x, double y){
        if (x == 0 || y == 0) {
            return 0;
        } else if (y > 0) {
            return x + multiply(x, y - 1);
        }
        return -multiply(x, -y);

    }
    public static double division(double num1, double num2){
        return num1 / num2;
    }
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        boolean number = true;
        while (number){
            int userNumber = sc.nextInt();
            if(userNumber >= min && userNumber <= max){
                return userNumber;
            }
            System.out.println("That isnt a valid number, try again");
        }
        return 4;
    }
    public static void factorial(){

        boolean userCont = true;
        while(userCont) {
            System.out.println("Pick a number 1-10");
            Scanner sc = new Scanner(System.in);
            long userNumber = sc.nextLong();
            long total = userNumber * (userNumber - 1);
//            System.out.println("first total: " + total);
            for (long x = userNumber - 2; x > 0; x--) {
//                System.out.println("total: " + total);
//                System.out.println("x: " + x);
                total += total * (x - 1);
            }
            System.out.print(userNumber + "! = ");
            for (int i = 1; i <= userNumber; i++) {
                if (i == 1) {
                    System.out.print(i + "");
                } else {
                    System.out.print(" x " + i);
                }
            }
            System.out.println("   = " + total);
            System.out.println("Do you want to continue? 'Y' or 'N'");
            String userAnswer = sc.next();
            System.out.println(userAnswer);
            if(userAnswer.equals("N")){
                userCont = false;
            }
        }

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
    }

    public static void guess(){
        Random rand = new Random();
        int winNum = rand.nextInt(100);
        Scanner sc = new Scanner(System.in);
        winNum = winNum + 1;
        boolean alive = true;
        int x = 5;
        int attempt = 1;
        System.out.println("I want to play a game!");
        System.out.println("I picked a number between 1-100");
        System.out.println("You have to guess my number.");
        System.out.println("If you get it wrong I will then tell you higher or lower");
        System.out.println("You have 5 chances, enter something that isn\'t a number and you lose");
        System.out.println("Live or die, make your choice.");
        while(alive){
            if(x == 0){
                System.out.println("You died");
                break;
            }
            System.out.println("Guess " + attempt + ". What will it be?: " );
            String userGuess = sc.next();

            try
            {
                // checking valid integer using parseInt() method
                Integer.parseInt(userGuess);
            }
            catch (NumberFormatException e)
            {
                System.out.println("You know what happens when we dont follow the rules!");
                System.out.println("You died!");
                break;
            }
            int userGuessNum = Integer.parseInt(userGuess);

            if(userGuessNum == winNum){
                System.out.println("Congratulations, you live");
                alive = false;
            }
            if(userGuessNum > winNum){
                System.out.println("you should go lower");
                x--;
                attempt++;
            }
            if(userGuessNum < winNum){
                System.out.println("you should go higher");
                x--;
                attempt++;
            }
        }
    }

    public static void countVowels(String input){
        int total = countAs(input, 'a');
        total += countAs(input, 'e');
        total += countAs(input, 'i');
        total += countAs(input, 'o');
        total += countAs(input, 'u');
        System.out.println(total);
    }
    public static int countAs(String input, char input2){
        int counter = 0;
        char a;
        char b = input2;
        for(int i = 0; i < input.length(); i++){
            a = input.charAt(i);
            if(Character.toLowerCase(a) == Character.toLowerCase(b)){
                counter++;
            }
        }
        return counter;
    }
    public static void calculator(){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        String mathSymbol;

        boolean userCont = true;
        while(userCont) {
            System.out.println("Enter your first number");
            num1 = sc.nextInt();
            System.out.println("Enter your math symbol: +,-,+,*");
            mathSymbol = sc.next();
            System.out.println("Enter your second number");
            num2 = sc.nextInt();
            if (mathSymbol.equals("+")) {
                System.out.println(num1 + num2);
            }
            else if (mathSymbol.equals("-")) {
                System.out.println(num1 - num2);
            }
            else if (mathSymbol.equals("*")) {
                System.out.println(num1 * num2);
            }
            else if (mathSymbol.equals("/")) {
                System.out.println(num1 / num2);
            }else{
                System.out.println("You didnt follow the rules");
            }
            System.out.println("Do you want to roll again? 'Y' or 'N' " );
            String userAnswer = sc.next();
            if(userAnswer.equals("N")){
                userCont = false;
            }
        }
    }
}