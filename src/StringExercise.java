public class StringExercise {
    public static void main(String[] args) {
//        String title = "Dr. Doctor";
//        boolean isADoctor = title.toLowerCase().startsWith("dr");
//        System.out.println(isADoctor);
//
//
//
//        boolean firstLetterCapitalized = false;
//        String word = "Test";
//        char firstLetter = word.charAt(0);
//
//        if (firstLetter == Character.toUpperCase(firstLetter)) {
//            firstLetterCapitalized = true;
//        }
//        System.out.println(firstLetterCapitalized);
//
//
//
//        String cat = "cat";
//        System.out.println(cat.indexOf("at"));
//
//
//
//        String good = "Good";
//        System.out.println(good.lastIndexOf("o"));
//
//
//
//        String longestword = "pneumonoultramicroscopicsilicovolcanoconiosis";
//        System.out.println(longestword.length());
//
//
////////////////missed some here
//
//
//        String name = "Graham Davis";
//        String firstName = name.substring(0, name.indexOf(" "));
//        String lastName = name.substring(name.indexOf(" ") + 1);
//        System.out.println(firstName);
//        System.out.println(lastName);
//
//
//        String hello = "hELlo";
//        System.out.println(hello.toUpperCase());
//        System.out.println(hello.toLowerCase());
////        System.out.println(hello);
//
//
//        String input = "      bob     smith \n\n    ";
//        String trimmedInput = input.trim();
//        System.out.println("|" + trimmedInput + "|");
//
//
//
//        String word1 = "Test";
//        String pigLatinWord = word1.trim() //trim the whitespace from around the word
//                .toLowerCase().substring(1) //force all letters lowercase and remove the 'T'
//                .concat(word1.substring(0, 1).toLowerCase()) //take first letter and add it to the end of the word
//                .concat("ay"); // add an 'ay' to the end of the new concatenated word
//        System.out.println(pigLatinWord);
//
//
//

        String message = "We don't need no eductation\nWe don't need no thought control";
        System.out.println(message);

        String message2 = "Check \"this\" out!, \"s inside of \"s! ";
        System.out.println(message2);

        String message3 = "In windows, the main drive is usually C:\\";
        System.out.println(message3);

        String message4 = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!";
        System.out.println(message4);

    }
}
