package BasicFileIODir;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class BasicFileIO {

    public static void main(String[] args) {

//        // BasicFileIo Path
//        Path BasicFileIOPath = Paths.get("src/BasicFileIODir", "BasicFileIO.java");
//
//        System.out.println(BasicFileIOPath);
//
        File file = new File("../codeup-java-exercises/src/BasicFileIODir/test.txt");
//
//        //Write your name and age to the file
//        try {
//            PrintWriter output = new PrintWriter(file);
//            output.println("Graham Davis");
//            output.println(30);
//            output.close();
//        } catch (IOException ex) {
//            System.out.printf("ERROR: %s\n", ex);
//        }

        //Reads from the file
        try {
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            int age = input.nextInt();

            System.out.printf("Name: %s\nAge: %d\n", name, age);
        } catch (FileNotFoundException ex) {
            System.out.printf("ERROR: %s\n", ex);
        }
    }

}
