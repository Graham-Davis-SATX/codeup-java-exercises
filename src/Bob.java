import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bob the Robot Teenager is lazy. Ask him a question or two, yell at him if you wish, or simply give him the silent treatment:");
        String str = sc.nextLine();
        char lastLetter = str.charAt(str.length() - 1);
        switch (lastLetter) {
            case '?' :
                System.out.println("Sure.");
                break;
            case '!' :
                System.out.println("Whoa, chill out!");
                break;
            case ' ' :
                System.out.println("Fine. Be that way!");
                break;
            default:
                System.out.println("Whatever bro");
                break;
        }
    }
}

/*
    Create a class named Bob with a main method for the following exercise.

    Bob is a lackadaisical teenager. In conversation, his responses are very limited.

    Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
    He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
    He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
    He answers 'Whatever.' to anything else.
    Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
*/