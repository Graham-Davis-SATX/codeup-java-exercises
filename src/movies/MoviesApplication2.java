package movies;

import util.Input;

public class MoviesApplication2 {
    public static void main(String[] args) {

        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();

        System.out.println("\n-----------------------------------\n");
            System.out.print(
                "What would you like to do?\n" +
                "0 - Get me outta here\n" +
                "1 - view all movies\n" +
                "2 - view movies in the Animated category\n" +
                "3 - view movies in the Drama category\n" +
                "4 - view movies in the Horror category\n" +
                "5 - view movies in the SciFi category\n" +
                "Enter your choice - "
            );
            switch (input.getInt(0,5)){
                case 0:
                    System.out.println("Bye Felicia");
                    System.exit(0);
                    break;
                case 1:
                    for (Movie movie: movies){
                        System.out.println("<Title> " + movie.getName() + " <Category> " + movie.getCategory());
                    }

            }
    }
}
