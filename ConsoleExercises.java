import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
//        System.out.println("Enter an integer: ");

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println("here is what you entered: ");
        System.out.println(i);


        System.out.println("Enter an a word: ");
        String string1 = scan.nextLine();
        System.out.println("Enter another word: ");
        String string2 = scan.nextLine();
        System.out.println("Enter a last word: ");
        String string3 = scan.nextLine();
        System.out.println("Here is what you entered: ");
        System.out.println(string1 + " "+ string2 + " " + string3);

        System.out.println("Enter an a sentence: ");
        String sentence = scan.next();
        System.out.println(sentence);

//        String sentence = scan.nextLine();
//        System.out.println(sentence);

        System.out.println("Enter the values of width of this classroom.");
        String width = scan.nextLine();
        System.out.println("Enter the values of length of the classroom.");
        String length = scan.nextLine();
        System.out.println("area = " + length + " x " + width);
        System.out.println("perimeter = "+ length + " x " + width + " + "  );



    }
}
