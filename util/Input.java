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

        public int getInt( int min, int max){
            System.out.println( min + " and " + max);
            int userInput = this.getInt();
            if(userInput > max || userInput < min) {
                return getInt( min, max);
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

    public static void quickSort(int[] arr, int left, int right) {
        int pivotIndex = left + (right - left) / 2;
        int pivotValue = arr[pivotIndex];
        int i = left, j = right;
        while (i <= j) {
            while (arr[i] < pivotValue) {
                i++;
            }
            while (arr[j] > pivotValue) {
                j--;
            }
            if (i <= j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
            if (left < i) {
                quickSort(arr, left, j);
            }
            if (right > i) {
                quickSort(arr, i, right);
            }
        }
    }


    public static int fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }


    public static int factorial(int number) {
        int result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }


//    public static Integer[] performLottery(int numNumbers, int numbersToPick) {
//        List<Integer> numbers = new ArrayList<>();
//        for(int i = 0; i < numNumbers; i++) {
//            numbers.add(i+1);
//        }
//        Collections.shuffle(numbers);
//        return numbers.subList(0, numbersToPick).toArray(new Integer[numbersToPick]);
//    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }
        String forward = sb.toString().toLowerCase();
        String backward = sb.reverse().toString().toLowerCase();
        return forward.equals(backward);
    }

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }


//    public static Date stringToDate(String date, String format) throws ParseException {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
//        return simpleDateFormat.parse(date);
//    }














}
