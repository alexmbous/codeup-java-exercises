import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String userChoice = scan.nextLine();
        do {
            String question = "\'Sure.\'";
            String yell = "\'Whoa, chill out!\'";
            String saysNothing = "\'Fine. Be that way!\'";
            String everythingElse = "\'Whatever.\'";
            System.out.print("What do you want to say to Bob?");
            String userTellsBob = scan.nextLine();
            if (userTellsBob.endsWith("?")) {
                System.out.println(question);
            } else if (userTellsBob.endsWith("!")) {
                System.out.println(yell);
            } else if (userTellsBob.trim().equals("")) {
                System.out.println(saysNothing);
            } else {
                System.out.println(everythingElse);
            }

            System.out.println("would you like to say something else to bob? (y/N");
//
        }while (userChoice.equals("y"));


    }
}
