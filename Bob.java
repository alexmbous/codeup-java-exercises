import java.util.Scanner;

public class Bob {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

//        Bob answers 'Sure.' if you ask him a question.
//
//        He answers 'Whoa, chill out!' if you yell at him.
//
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//
//        He answers 'Whatever.' to anything else.

        String question = "\'Sure.\'";
        String yell = "\'Whoa, chill out!\'";
        String saysNothing = "\'Fine. Be that way!\'";
        String everythingElse = "\'Whatever.\'";
        System.out.print("What do you want to say to Bob?");
        String userTellsBob = scan.nextLine();
        if(userTellsBob.endsWith("?")){
            System.out.println(question);
        }
        else if (userTellsBob.endsWith("!")) {
            System.out.println(yell);
        }
        else if(userTellsBob.equals(" ")){
            System.out.println(saysNothing);
        } else {
            System.out.println(everythingElse);
        }





    }
}
