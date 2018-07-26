public class MethodsExercisesNotes {

    // Class variables
    static String name = "Graham";

    public static void main(String[] args) {

        eatCereal();

        boolean res = isOne(1);
        System.out.println(res);

        System.out.println(isOne(2));
        System.out.println(isOne(5));
        System.out.println("----------");
        System.out.println(isOne("6"));
        System.out.println(isOne("1"));
        System.out.println(name);

        isOne("6");

        count();
        count(6);

    } // End of main


    // I don't care about the result, actions
    public static void eatCereal(){
        System.out.println("Get a bowl");
        System.out.println("Pour milk");
        System.out.println("Add cereal");
        System.out.println("Use a spoon");
        System.out.println(name + " will eat all the cereal.");
    }

    // I care about the return result
    public static boolean isOne(int number){
        return false;
        /*return number == 1;*/
    }

    // Method overloading
    public static boolean isOne(String number){
        return number.equals("1");
    }


    public static void count(){
        for(int i = 5; i > 0; i--){
            System.out.println(i);
        }
    }

    public static void count(int n){
        // When its finished
        if (n <= 0){
            System.out.println("All Done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

} // End Methods Exercise