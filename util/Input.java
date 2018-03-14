package util;

import java.math.BigInteger;
import java.util.Scanner;

public class Input {
    private static Scanner scan;
    private String hex;

    public Input() {
        Input.scan = new Scanner(System.in).useDelimiter("\n");
    }

    public boolean yesNo() {
        System.out.println();
        String input = Input.scan.next();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

    public static String getString() {
        return Input.scan.nextLine();
    }

    public int getInt() {
        String userInput = Input.scan.next();
        try {
            return Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Your input must be a number");
            System.out.println(e.getMessage());
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        int num;
        try {
            String possibleNumber = Input.getString();
            num = Integer.valueOf(possibleNumber);
        } catch (NumberFormatException e) {
            System.out.print("Please enter a number between " + min + " and " + max + ": ");
            return getInt(min, max);
        }

        if (num >= min && num <= max) {
            return num;
        }

        System.out.println(num + " number out of range, try again");
        return getInt(min, max);
    }

    public int getInt(String prompt) {
        String userInput = Input.scan.next();
        try {
            return Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            return getInt(prompt);
        }
    }

    public double getDouble(double min, double max) {
        System.out.println("Please input a decimal number between " + min + " and " + max);

        double userInput = this.getDouble();

        if (userInput > max || userInput < min) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }

    public double getDouble() {
        return Input.scan.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return Input.scan.nextDouble();
    }


//    public String getBin(String radix) {
//        String userInput = scan.next();
//            try {
//            return String.valueOf(userInput, 16);
//        } catch (NumberFormatException e){
//                System.out.println("please enter a valid hex value");
//                return getBin();
//            }
//    public Integer getHex(String, radix) {
//        return Integer.valueOf(userInput, 16);
//    }

}
