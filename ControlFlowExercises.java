import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int i = 5;
        while (i <= 15) {
            System.out.print(i);
            i++;
        }

        // start at 0 and increment by 2 to 100
//        int byTwos = 0;
//        do{
//            System.out.print(byTwos);
//            byTwos += 2;
//        } while(byTwos <= 100);

        // start at 100 and decrement by 5 to -10
//        int byFives = 100;
//        do{
//            System.out.print(byFives);
//            byFives -= 5;
//        } while(byFives >= -10);

        // refactor ^^ to use a for loop.
//        for(int i = 100; i>= -10; i -=5){
//            System.out.println(i);
//        }
        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.

//        long num = 2;
//        do {
//            System.out.println(num);
//            num *= num;
//        }while (num <= 1000000);

//        for (long num1 = 2; num1 <= 1000000; num1 *= 2){
//            System.out.println(num1);
//        }


        for (int q = 1; q <= 100; q++) {
            String result = "";
            if (q % 3 == 0) {
                result += "Fizz ";
            }
            if (q % 5 == 0) {
                result += "Buzz";
            }
            if (q % 3 == 0 || q % 5 == 0) {
                System.out.println(result);
            } else {
                System.out.println(q);
            }
        }


//        boolean userContinues = true;
//
//        do {
//            System.out.print("What number would you like to go up to?");
//            int userInt = scan.nextInt();
//            System.out.println();
//            System.out.println("Here is your table!");
//            System.out.println();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | ------");
//            for (int w = 1; w <= userInt; w *= w) {
//                System.out.format("%-7d", w);
//                System.out.print("|");
//                System.out.format(" %-8d", w * w);
//                System.out.print("|");
//                System.out.format(" %-9d", w * w * w);
//                System.out.println();
//            }
//            System.out.print("Are you sure you want to continue? (y/N)");
   //         String userResponse = scan.next();
//            if(userResponse == userContinues)
//        }while(true);
//
//
//        }
}
}