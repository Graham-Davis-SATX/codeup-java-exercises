import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        boolean userContinues = true;
do {

        System.out.println("Bob the Robot Teenager is lazy. Ask him a question or two, yell at him if you wish, or simply give him the silent treatment:");
        Scanner input = new Scanner(System.in);
        String msg = input.nextLine().trim();
        String uppercaseVer = msg.toUpperCase();

        if(msg.endsWith("?")){
            System.out.println("Sure.\n");
        } else if (msg.endsWith("!") || (uppercaseVer.equals(msg) && !msg.isEmpty())) {
            System.out.println("Whoa, chill out!\n");
        } else if (msg.isEmpty()) {
            System.out.println("Fine! Be that way!\n");
        } else {
            System.out.println("Whatever bro!\n");
        }

    System.out.print("Would you like to keep talking to Bob (y/n)?\n");
    String userResponse = input.next();
    if (!userResponse.equalsIgnoreCase("y")) {
        userContinues = false;
    }


} while (userContinues);


//        System.out.print("Bob the Robot Teenager is lazy. Ask him a question or two, yell at him if you wish, or simply give him the silent treatment:");
//        String str = input.nextLine();
//        char lastLetter = str.charAt(str.length() - 1);
//        switch (lastLetter) {
//            case '?' :
//                System.out.println("Sure.");
//                break;
//            case '!' :
//                System.out.println("Whoa, chill out!");
//                break;
//            case ' ' :
//                System.out.println("Fine. Be that way!");
//                break;
//            default:
//                System.out.println("Whatever bro");
//                break;
//        }
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