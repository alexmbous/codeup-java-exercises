package util;

import java.math.BigInteger;
import java.util.Scanner;

public class Input {
    private Scanner scan;
    private String hex;

        public Input() {
            this.scan = new Scanner(System.in).useDelimiter("\n");
        }

        public boolean yesNo() {
            System.out.println();
            String input = this.scan.next();
            if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
                return true;
            } else {
                return false;
                }
            }

        public boolean yesNo(String prompt) {
            System.out.println(prompt);
            return yesNo();
        }

        public String getString() {
            return this.scan.next();
        }

        public int getInt(int min, int max) {
        System.out.println("Please input an integer between " + min + " and " + max);

            int userInput = this.scan.nextInt();

            if(userInput > max || userInput < min){
                return getInt(min, max);
            } else {
                return userInput;
            }
         }

        public int getInt() {
            String userInput = this.scan.next();
            try {
                return Integer.valueOf(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Your input must be a number");
                System.out.println(e.getMessage());
                return getInt();
            }
        }

    public int getInt(String prompt) {
        String userInput = this.scan.next();
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

    public double getDouble(){
        return this.scan.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return this.scan.nextDouble();
    }

    static String getBin(String s) {
        return new BigInteger(s, 16).toString(2);
    }
    public String toHex(String arg) {
        return String.format("%x", new BigInteger(1, arg.getBytes(/*YOUR_CHARSET?*/)));
    }

}
