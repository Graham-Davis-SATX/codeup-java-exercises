import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

/*
        int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }
*/

/*
        int i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 100);
*/

/*        int i = 100;
        do {
            System.out.println(i);
            i -= 5;
        } while (i >= -10);
*/

/*
        long i = 2;
        do {
            System.out.println(i);
            i *= i;
        } while (i < 9223372036854775807);
*/

//main_syntax
/*
        for(int i = 1; i <= 100; i++) {
            if (i%15==0) {
                System.out.println("main_syntax");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
*/

        Scanner sc = new Scanner(System.in);
//        System.out.println("I can square and cube any number!\nWhat number would you like to use?");
//        String userStr = sc.nextLine();
//        float userInt = Float.parseFloat(userStr);
//        for (int i = 1; i <= userInt; i++) {
//            if (i<=userInt) {
//                float powers = userInt * i;
//                System.out.println(powers);
//            }
//        }

        boolean userContinues = true;

        do {
            System.out.println("I can square and cube any number!\nWhat number would you like to use?");
            int userInt = sc.nextInt();
            System.out.println();
            System.out.println("Here is your table");
            System.out.println();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= userInt; i += 1) {
                System.out.printf("%-7d", i);
                System.out.print("|");
                System.out.printf(" %-8d", i*i);
                System.out.print("|");
                System.out.printf(" %-9d", i*i*i);
                System.out.println();
            }
            System.out.print("Would you like to enter another number (y/n)?");
            String userResponse = sc.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                userContinues = false;
            }



        } while (userContinues);
    }
}
