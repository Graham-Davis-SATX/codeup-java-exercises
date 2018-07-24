import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Please enter any real number:");
        int num = sc.nextInt();
        System.out.println(num);
        */

        /*
        System.out.println("Enter three(3) words of your choosing:");
        String firstWord = sc.next();
        String secondWord = sc.next();
        String thirdWord = sc.next();
        System.out.println(firstWord + "\n" + secondWord + "\n" + thirdWord);
        System.out.printf("%s\n%s\n%s", firstWord, secondWord, thirdWord);
        */

        /*
        System.out.println("Please enter a full sentence:");
        // String senTENCE = sc.next();
        String senTENCE = sc.nextLine();
        System.out.println(senTENCE);
        */


        System.out.println("Enter the length of the code up classroom:");
        String lengthStr = sc.nextLine();
        System.out.println("Enter the width of the code up classroom:");
        String widthStr = sc.nextLine();
        System.out.println("Enter the height of the code up classroom:");
        String heightStr = sc.nextLine();
        float length = Float.parseFloat(lengthStr);
        float width = Float.parseFloat(widthStr);
        float height = Float.parseFloat(heightStr);
        // System.out.println(length);
        // System.out.println(width);
        // System.out.println(height);
        float area = length * width;
        float perimeter = (length * 2) + (width * 2);
        float volume = length * width * height;
        System.out.println("The area of the Codeup Classroom is: " + area + " sq.ft." + ", the perimeter is: " +  perimeter + " ft., and the volume of the room is: " + volume + " cu.ft.");


        /*
        BONUS 1
        Prompt the user to enter a favorite quote
        Output the quote
        Ask them to enter how many words are in the quote
        Output the number they entered
        */

        /*
        BONUS 2
        Prompt the user to enter a list of top three favorite foods separated by only spaces
        Use the printf() to output there three top foods with the format:
        1) FirstFood
        2) SecondFood
        3) ThirdFood
        */

        /*
        BONUS 3
        Prompt the user to enter a grocery list of three items
        Each item should only be separated by a comma (no spaces)
        You will need to use the .useDelimiter() method on your scanner object
        Output the result as a comma-separated list using printf()
        */
    }
}
