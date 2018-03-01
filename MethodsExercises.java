import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        int number1 = getInteger(1, 10);
        int number2 = getInteger(10, 33);

        double sum = add(number1, number2);
        double difference = subtract(number1, number2);
        double product = multiplication(number1, number2);
        double quotient = divide(number1, number2);
        double modulus = modulo(number1, number2);

        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
        System.out.println("The difference of " + number1 + " and " + number2 + " is: " + difference);
        System.out.println("The sum product of " + number1 + " and " + number2 + " is: " + product);
        System.out.println("The quotient of " + number1 + " and " + number2 + " is: " + quotient);
        System.out.println("The modulus of " + number1 + " and " + number2 + " is: " + modulus);

        System.out.println("Now we're going to calculate factorials!");
        int userInt;
        long factorialResult;

        do {
            userInt = getInteger(1, 10);
            factorialResult = factorial(userInt);
            System.out.println("The factorial for " + userInt + "! is " + factorialResult);
        } while(wantsToContinue());

        System.out.println("Thanks for playing \"Factorial!\"");

        System.out.println();
        System.out.println("Now let's play \"Roll The Dice!\"");
        diceRoller();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double modulo(double a, double b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        System.out.println("Please input an integer between " + min + " and " + max + ":");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number < min || number > max) {
            return getInteger(min, max);
        } else {
            return number;
        }
    }

    public static boolean wantsToContinue() {
        System.out.println();
        Scanner scan = new Scanner(System.in);
        String userSelection;
        boolean wantsToContinue;

        System.out.println("Would you like to continue? Type \"y\" or yes to continue.");
        userSelection = scan.next();
        wantsToContinue = userSelection.equalsIgnoreCase("y") || userSelection.equalsIgnoreCase("yes");

        return wantsToContinue;
    }

    public static long factorial(int num) {
        // set the output at
        long output = num;

        // start w/ 1, then multiply by each number up to but not including the num.
        for(int i = 1; i < num; i++) {
            output *= i;
        }

        return output;
    }


    public static void diceRoller() {
        diceSplash();

        System.out.println("How many sides should each die have?");
        int sides = getInteger(1, 100);
        int die1;
        int die2;
        int result;

        die1 = roll(sides);
        System.out.println("The first die rolled a " + die1);

        die2 = roll(sides);
        System.out.println("The second die rolled a " + die2);

        result = die1 + die2;
        System.out.println("Result of both dice is: " + result);

        if(wantsToContinue()) {
            diceRoller();
        } else {
            System.out.println("Thanks for playing \"D I C E   R O L L E R \"!");
        }

    }

    public static int roll(int numberOfSides) {
        return (int) Math.ceil(Math.random() * numberOfSides);
    }

    public static void diceSplash() {
        String display1 = "\n\n" +
                "       .-------.    ______\n" +
                "      /   o   /|   /\\     \\\n" +
                "     /_______/o|  /o \\  o  \\\n" +
                "     | o     | | /   o\\_____\\\n" +
                "     |   o   |o/ \\o   /o    /\n" +
                "     |     o |/   \\ o/  o  /\n" +
                "     '-------'     \\/____o/ \n\n\n";

        String display2 = "\n" +
                "              _______.\n" +
                "   ______    | .   . |\\\n" +
                "  /     /\\   |   .   |.\\\n" +
                " /  '  /  \\  | .   . |.'|\n" +
                "/_____/. . \\ |_______|.'|\n" +
                "\\ . . \\    /  \\ ' .   \\'|\n" +
                " \\ . . \\  /    \\____'__\\|\n" +
                "  \\_____\\/"
                + "\n\n";


        String display3 = "\n" +
                "  ____\n" +
                " /\\' .\\    _____\n" +
                "/: \\___\\  / .  /\\\n" +
                "\\' / . / /____/..\\\n" +
                " \\/___/  \\'  '\\  /\n" +
                "          \\'__'\\/"
                + "\n\n";

        int randomDisplay = roll(3);

        String display;

        if(randomDisplay == 1) {
            display = display1;
        } else if(randomDisplay == 2) {
            display = display2;
        } else {
            display = display3;
        }

        System.out.println(display);
    }


}







//import java.util.Scanner;
//import java.lang.Math;
//public class MethodsExercises {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int numb1 = getInteger(1, 10);
//        int numb2 = getInteger(11,33);
//
//            double sum = add(numb1, numb2);
//            double difference = subtract(numb1, numb2);
//            double product = multiply(numb1, numb2);
//            double quotient = divide(numb1, numb2);
//
//            getInteger(1, 100);
//            factorial();
//            rollDiceGame(scan);
//            wantsToContinue();
//
//        System.out.println("the sum of " + numb1 + " and " + numb2 + " = " + (sum));
//        System.out.println("the difference of " + numb1 + " and " + numb2 + " = " + (difference));
//        System.out.println("the product of " + numb1 + " and " + numb2 + " = " + (product));
//        System.out.println("the quotient of " + numb1 + " and " + numb2 + " = " + (quotient));
//
//
//    }
//        public static double add(double a, double b) {
//            return a + b;
//        }
//
//        public static double  subtract(double a, double b) {
//            return a - b;
//        }
//
//        public static double  multiply(double a, double b) {
//            return a * b;
//        }
//
//        public static double  divide(double a, double b) {
//            return a / b;
//        }
//
//
//
//
//
//
//    public static int getInteger(int min, int max){
//        System.out.println(("please input an integer between" + min + " and " + max + ":"));
//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        if(number < min || number > max){
//            return getInteger(min,max);
//
//        }else{
//            return number;
//        }
//    }
//
//    public static boolean wantsToContinue() {
//        System.out.println();
//        Scanner scan = new Scanner(System.in);
//        String userSelection;
//        boolean wantsToContinue;
//
//        System.out.println("would you like to continue? (y/N)");
//        userSelection = scan.next();
//        wantsToContinue = userSelection.equalsIgnoreCase("y");
//
//        return wantsToContinue;
//        }
//
//
//
//
//    public static long mathFactorial(int num) {
//        int result = 1;
//            for (int i = 1; i <= num; i += 1) {
//                result *= i;
//            }
//            return result;
//        }
//    public static void factorial() {
//        Scanner scan = new Scanner(System.in);
//        boolean userContinues;
//        String userResponse;
//        int userNum = getInteger(1, 10);
//        do {
//            System.out.println("Enter an integer from 1 to 10.");
//            System.out.println(mathFactorial(userNum));
//            do {
//                System.out.println("Do you wish to continue? (y/N): ");
//                userResponse = scan.next().trim();
//            } while (!userResponse.equalsIgnoreCase("y") && !userResponse.equalsIgnoreCase("n"));
//
//            userContinues = userResponse.equalsIgnoreCase("y");
//        } while (userContinues);
//    }
//
//    public static int randomWithRange(int min, int max)
//        {
//            int range = (max - min) + 1;
//            return (int)(Math.random() * range) + min;
//        }
//
//        public static void rollDiceGame(Scanner sc) {
//            String userChoice;
//            System.out.print("Please enter the number of sides for the dice: ");
//            int nSides = getInteger(1, 6);
//            do {
//                System.out.println("You have rolled a " + randomWithRange(1, nSides) + " and a " + randomWithRange(1, nSides));
//                do {
//                    System.out.println("Would you like to roll again? (y/N)");
//                    userChoice = sc.next().trim();
//                } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
//
//            } while (!userChoice.equals("n"));
//        }
//
//    }
//
