package grades;

import util.Input2;

import java.util.HashMap;


public class GradesApplication {

//    public static Scanner sc;
    public static Input2 input;
    public static void main(String[] args) {
        initApp();
    }

    public static void initApp(){

        HashMap<String, Student> students = populateData();
        System.out.println(returnWelcomeMessage(students));
        input = new Input2();
        boolean willContinue;

        do {

            while(true){

                String choice = input.getString("What student would you like to see more information on?");

                if(!students.containsKey(choice)){
                    System.out.println("Sorry, no student found with the gihub username of " + choice);
                    System.out.println("Would you like to see another student?");

                    if(!input.yesNo()){
                        break;
                    }

                } else {
//                    If the user key exists
                    System.out.printf("Name: %s - Gihub Username: %s\n" +
                            "Current Average: %f \n", students.get(choice).getName(), choice, students.get(choice).getGradeAverage());
                }
            }

            System.out.println("Will you continue?");
            willContinue = input.yesNo();
            if(!willContinue){
                System.out.println("Goodbye, and have a wonderful day!");
            }
        } while(willContinue);
        }

    public static String returnWelcomeMessage(HashMap<String, Student> students) {
        String output = "";
        output += "Welcome! \n\n";
        output += "Here are the Github usernames of our students:\n\n";
        for (String key : students.keySet()) {
//            System.out.println(key);
            output += "|" + key + "| ";
        }
        return output.trim();
    }


    public static HashMap<String, Student> populateData() {
        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("Sally");
        s1.addGrade(80);
        s1.addGrade(85);
        s1.addGrade(79);
        s1.addGrade(32);

        Student s2 = new Student("Johnny");
        s2.addGrade(85);
        s2.addGrade(85);
        s2.addGrade(85);
        s2.addGrade(85);

        Student s3 = new Student("Billy");
        s3.addGrade(90);
        s3.addGrade(96);
        s3.addGrade(102);
        s3.addGrade(98);

        Student s4 = new Student("Walt");
        s4.addGrade(67);
        s4.addGrade(50);
        s4.addGrade(42);
        s4.addGrade(71);

        students.put("a123", s1);
        students.put("b123", s2);
        students.put("c123", s3);
        students.put("d123", s4);

//        System.out.println(students.size());
        System.out.println(students.get("a123").getGradeAverage());

        return students;
    }
}

