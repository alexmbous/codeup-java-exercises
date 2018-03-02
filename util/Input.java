package util;

import java.util.Scanner;

public class Input {
    private Scanner scan;

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

        public int getInt(int min, int max){
            System.out.println("Please input an integer between " + min + " and " + max);
            int userInput = this.getInt();
            if(userInput > max || userInput < min) {
                return getInt(min, max);
            } else {
                return userInput;
            }
        }

        public int getInt(){
            return this.scan.nextInt();
        }


        public int getInt(String prompt) {
            System.out.println(prompt);
            return this.scan.nextInt();
        }


        public double getDouble(double min, double max) {
            System.out.println("Please input an number with a decimal between " + min + " and " + max + ".");
            double number = this.getDouble();
            if(number > max || number < min) {
                return getDouble(min, max);
            } else {
                return number;
            }
        }

    public double getDouble() {
        return this.scan.nextDouble();
    }

        public double getDouble(double min, double max, String prompt) {
            System.out.println(prompt);
            double number = this.getDouble();
            if(number > max || number < min) {
                return getDouble(min, max);
            } else {
                return number;
            }
        }

        public double getDouble(String prompt) {
            System.out.println(prompt);
            return this.scan.nextDouble();
        }


}
