package grades;
import java.util.HashMap;
import util.Input;
import java.util.Scanner;
public class GradesApplication {

    public static void main(String[] args) {
        Input input = new Input();


        HashMap<String, Student> students = new HashMap<>();
        students = addStudents();
        System.out.println("\n Welcome! \n\nHere are the github usernames of our students:");
        for(String key : students.keySet()) {
            System.out.print(" |  " + key);
        }
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        do {

            System.out.println("Which student would you like to see more information on?");
                String userName = input.getString();
            if(students.containsKey(userName)) {
                Student student = students.get(userName);
                System.out.println("Name: " + student.getName() + "- GitHub UserName:  " + userName + "\nCurrent Average: " + (int)student.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the github username of" + userName);
            }

        } while (input.yesNo("Would you like to see another student? y/n") || !input.yesNo("Goodbye, and have a wonderful day!"));


    }
        public static HashMap<String, Student> addStudents() {
            HashMap<String, Student> students = new HashMap<>();

            Student Alex = new Student("Alex");
            Student Bill = new Student("Bill The Dog");
            Student Renee = new Student("Renee");

            Alex.addGrade(100);
            Alex.addGrade(85);
            Alex.addGrade(95);
            Alex.addGrade(100);
            Alex.addGrade(85);
            Alex.addGrade(95);
            Alex.addGrade(100);
            Bill.addGrade(5);
            Bill.addGrade(40);
            Bill.addGrade(10);
            Bill.addGrade(5);
            Bill.addGrade(0);
            Bill.addGrade(24);
            Renee.addGrade(90);
            Renee.addGrade(95);
            Renee.addGrade(100);
            Renee.addGrade(100);
            Renee.addGrade(100);
            Renee.addGrade(95);

            students.put("alexmbous", Alex);
            students.put("billBobous", Bill);
            students.put("ReneeBous", Renee);

            return students;
        }
    }


