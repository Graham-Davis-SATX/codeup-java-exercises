public class CodeBat {
    public static void main(String[] args) {
//        sleepIn(false, false); sleepIn(true, false); sleepIn(false, true);
//        monkeyTrouble(true, true); monkeyTrouble(true, false); monkeyTrouble(false, false);
//        sumDouble(1, 2); sumDouble(3, 2); sumDouble(2, 2);
//        diff21(19); diff21(10); diff21(25);
//        parrotTrouble(true, 6); parrotTrouble(true, 7); parrotTrouble(false, 18);
//        makes10(9, 10); makes10(9, 9); makes10(1, 9);
//        nearHundred(93); nearHundred(90); nearHundred(189); nearHundred(5); nearHundred(150);
//        posNeg(2, -2, false); posNeg(-2, 2, false); posNeg(-4, -5, true);
//        notString("candy"); notString("x"); notString("not bad");
//        missingChar("kitten", 1); missingChar("kitten", 0); missingChar("kitten", 4);
//        frontBack("code"); frontBack("a"); frontBack("ab"); frontBack("Chocolate");
//        front3("Java"); front3("Chocolate"); front3("abc");
//        backAround("cat"); backAround("Hello"); backAround("a");
//        or35(3); or35(10); or35(8);
//        front22("kitten"); front22("Ha"); front22("abc"); front22("a");
//        startHi("hi there"); startHi("hi"); startHi("hello hi");
//        icyHot(120, -1); icyHot(-1, 120); icyHot(2, 120);
//        in1020(12, 99); in1020(21, 12); in1020(8, 99);
//        hasTeen(13, 20, 10); hasTeen(20, 19, 10); hasTeen(20, 10, 12);
//        loneTeen(13, 99); loneTeen(21, 19); loneTeen(13, 13);
    } // end psvm


    // Warm-up 1 'sleepIn'
    /** The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in. */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        System.out.println("Did we sleep in?");
        if (!weekday || vacation) {
            System.out.println("Nope! Not a weekday or on Vacation");
            return true;
        }
        System.out.println("Oh yeah we did! It's a weekday or we aren\'t on Vacation");

        return false;
    }


    // Warm-up 2 'monkeyTrouble'
    /** We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble. */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            System.out.println("Oh boy, we're in trouble!");
            return true;
        }
        if (!aSmile && !bSmile) {
            System.out.println("No trouble here!");
            return true;
        }
        return false;
    }


    // Warm-up 3 'sumDouble'
    /** Given two int values, return their sum. Unless the two values are the same, then return double their sum. */
    public static int sumDouble(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
        if (a == b) {
            sum *=2;
            System.out.println("The numbers are a match - let's double their sum too! " + a + " and " + b + " added together *2 is " + sum);
        }
        return sum;
    }


    // Warm-up 4 'diff21'
    /** Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21. */
    public static int diff21(int n) {
        if (n <= 21) {
            System.out.println("Abs Diff:" + n);
            return 21 - n;
        } else {
            int doubled = (n - 21)*2;
            System.out.println("Double Abs Diff:" + doubled);
            return doubled;
        }
    }

    // Warm-up 5 'parrotTrouble'
    public static boolean parrotTrouble(boolean talking, int hour) {
        boolean trouble = (talking && (hour < 7 || hour > 20));
        System.out.println("Is the parrot talking before 7am or after 8pm? " + trouble);
        return trouble;
        // Need extra parenthesis around the || clause
        // since && binds more tightly than ||
        // && is like arithmetic *, || is like arithmetic +
    }


    // Warm-up 6 'makes10'
    /** Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10. */
    public static boolean makes10(int a, int b) {
        boolean made10 = (a == 10 || b == 10 || a+b ==10);
        System.out.println("Is an integer 10 or did we make 10? " + made10);
        return made10;
    }


    // Warm-up 7 'nearHundred'
    /** Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number. */
    public static boolean nearHundred(int n) {
        boolean tenOff = ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
        System.out.println("Within ten? " + tenOff);
        return tenOff;
    }


    // Warm-up 8 'posNeg'
    /** Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative. */
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            boolean bothIntNeg = (a < 0 && b < 0);
            System.out.println("The passed boolean parameter was negative (" + negative + ") and both integers are negative " + "('" + a + "') " + "&" + " ('" + b + "')");
            return bothIntNeg;
        } else {
            boolean oneIntNeg = ((a < 0 && b > 0) || (a > 0 && b < 0));
            System.out.println("One integer is positive and one is negative " + "('" + a + "') " + "&" + " ('" + b + "')");
            return oneIntNeg;
        }
    }


    // Warm-up 9 'notString'
    /** Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings. */
    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        System.out.println("not " + str);
        return "not " + str;
    }

    // Warm-up 10 'missingChar'
    /** Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive). */
    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n+1, str.length());
        System.out.println(front + back);
        return front + back;
    }


    // Warm-up 11 'frontBack'
    /** Given a string, return a new string where the first and last chars have been exchanged. */
    public static String frontBack(String str) {
        if (str.length() == 1) {
            System.out.println(str);
            return str;
        } else {
            if (str.length() < 1) return str;
            String mid = str.substring(1, str.length() - 1);
            System.out.println(str.charAt(str.length() - 1) + mid + str.charAt(0));
            return str.charAt(str.length() - 1) + mid + str.charAt(0);
        }
    }

    // Warm-up 12 'front3'
    /** Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front. */
    public static String front3(String str) {
        String front;
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }
        System.out.println(front + front + front);
        return front + front + front;
    }

    // Warm-up 13 'backAround'
    /** Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more. */
    public static String backAround(String str) {
        String last = str.substring(str.length() - 1);
        System.out.println(last + str + last);
        return last + str + last;
    }


    // Warm-up 14 'or35'
    /** Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod */
    public static boolean or35(int n) {
        boolean threeOrFive = (n % 3 == 0) || (n % 5 == 0);
        System.out.println(n + " is a multiple of 3 or 5? " + threeOrFive);
        return threeOrFive;
    }


    // Warm-up 15 'front22'
    /** Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there. */
    public static String front22(String str) {
        int takeTwo = 2;
        if (takeTwo > str.length()) {
            takeTwo = str.length();
        }
        String front = str.substring(0, takeTwo);
        System.out.println(front + str + front);
        return front + str + front;
    }


    // Warm-up 16 'startHi'
    /** Given a string, return true if the string starts with "hi" and false otherwise. */
    public static boolean startHi(String str) {
        if (str.length() < 2) return false;
        String firstTwo = str.substring(0, 2);
        boolean startsWithHi = firstTwo.equals("hi");
        System.out.println("Does (" + str + ") start with 'hi'? " + startsWithHi);
        return startsWithHi;
        // This last part can be shortened to: return(firstTwo.equals("hi"));
    }


    // Warm-up 17 'icyHot'
    /** Given two temperatures, return true if one is less than 0 and the other is greater than 100. */
    public static boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
    }


    // Warm-up 18 'in1020'
    /** Given 2 int values, return true if either of them is in the range 10..20 inclusive. */
    public static boolean in1020(int a, int b) {
        boolean tenToTwenty = ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
        System.out.println("Is either " + a + " or " + b + " greater than or equals to ten OR less than or equals to twenty? " + tenToTwenty);
        return tenToTwenty;
    }


    // Warm-up 19 'hasTeen'
    /** We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen. */
    public static boolean hasTeen(int a, int b, int c) {
        boolean numIsATeen = ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));
        System.out.println("Is [" + a + ", " + b + ", " + "or " + c + "] a number in the teens? " + numIsATeen);
        return numIsATeen;
    }


    // Warm-up 20 'loneTeen'
    /** We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both. */
    public static boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        boolean oneTeenAllowed = (aTeen && !bTeen) || (!aTeen && bTeen);
        System.out.println("We've got two numbers but only one ~teen is allowed. Here are the numbers: " + a + " and " + b + ". Is there only one ~teen number? " + oneTeenAllowed);
        return oneTeenAllowed;
    }













} //end public class CodeBat
