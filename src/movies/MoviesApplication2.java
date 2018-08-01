package movies;

import util.Input;

public class MoviesApplication2 {

    public static void printMovie(Movie movie){
        System.out.println("<Title> " + movie.getName() + " <Category> " + movie.getCategory());
    }

    public static void main(String[] args) {

        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();

        while(true) {
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
                    System.out.println("\uD83D\uDC4B***Bye Felicia***\uD83D\uDC4B");
                    System.exit(0);
                    break;
                case 1:
                    for (Movie movie: movies){
//                        System.out.println("<Title> " + movie.getName() + " <Category> " + movie.getCategory());
                        printMovie(movie);
                    }
                case 2:
                    for (Movie movie: movies){
                        if(movie.getCategory().equals("animated")){
//                            System.out.println("<Title> " + movie.getName() + " <Category> " + movie.getCategory());
                            printMovie(movie);
                        }
                    }
                case 3:
                    for (Movie movie: movies){
                        if(movie.getCategory().equals("Drama")){
//                            System.out.println("<Title> " + movie.getName() + " <Category> " + movie.getCategory());
                            printMovie(movie);
                        }
                    }
                case 4:
                    for (Movie movie: movies){
                        if(movie.getCategory().equals("Horror")){
//                            System.out.println("<Title> " + movie.getName() + " <Category> " + movie.getCategory());
                            printMovie(movie);
                        }
                    }
                case 5:
                    for (Movie movie: movies){
                        if(movie.getCategory().equals("scifi")){
//                            System.out.println("<Title> " + movie.getName() + " <Category> " + movie.getCategory());
                            printMovie(movie);
                        }
                    }

            }
        }
    }
}
