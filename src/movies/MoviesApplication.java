package movies;
import util.Input;


public class MoviesApplication {
    private static Input input = new Input();

    public static void main(String[] args) {

        boolean exit = false;

        Movie[] movies = MoviesArray.findAll();

        while (!exit) {
            System.out.println("\n-----------------------------------\n");
            System.out.print(
                    "What would you like to do?\n" +
                            "0 - exit\n" +
                            "1 - view all movies\n" +
                            "2 - view movies in the Animated category\n" +
                            "3 - view movies in the Drama category\n" +
                            "4 - view movies in the Horror category\n" +
                            "5 - view movies in the SciFi category\n" +
                            "Enter your choice - "
            );
            int userChoice = input.getInt(0, 5);

            if (userChoice == 0) {
                exit = true;
            } else if (userChoice == 1) {
                for (int i = 0; i < movies.length; i++){
                    System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                }
            } else if (userChoice == 2) {
                for (int i = 0; i < movies.length; i++){
                    if(movies[i].getCategory().equals("animated")) {
//                        System.out.printf("Here is your server name:%n%s-%s", randomAdjective, randomNouns);
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                    }
                }
            } else if (userChoice == 3) {
                for (int i = 0; i < movies.length; i++){
                    if(movies[i].getCategory().equals("drama")) {
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                    }
                }
            } else if (userChoice == 4) {
                for (int i = 0; i < movies.length; i++){
                    if(movies[i].getCategory().equals("horror")) {
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                    }
                }
            } else if (userChoice == 5) {
                for (int i = 0; i < movies.length; i++){
                    if(movies[i].getCategory().equals("scifi")) {
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                    }
                }
            }
        }
        System.out.println("Goodbye!");
    }
}
