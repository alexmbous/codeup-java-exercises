public class PrettyPrinter {
    private static boolean bold = true;

    public static void main(String[] args) {
        System.out.println("Bold");
        PrettyPrinter.red("red");
        PrettyPrinter.green("green");
        PrettyPrinter.yellow("yellow");
        PrettyPrinter.blue("blue");
        PrettyPrinter.purple("purple");
        PrettyPrinter.cyan("cyan");

        PrettyPrinter.bold = false;
        System.out.println("Not Bold");
        PrettyPrinter.red("red");
        PrettyPrinter.green("green");
        PrettyPrinter.yellow("yellow");
        PrettyPrinter.blue("blue");
        PrettyPrinter.purple("purple");
        PrettyPrinter.cyan("cyan");
    }

    private static void colorize(int colorCode, String text) {
        String message = "\033";
        message += bold ? "[01;" : "[";
        message += colorCode + "m" + text + "\033[0m";
        System.out.println(message);
    }

    public static void red(String text) {
        colorize(31, text);
    }

    public static void green(String text) {
        colorize(32, text);
    }

    public static void yellow(String text) {
        colorize(33, text);
    }

    public static void blue(String text) {
        colorize(34, text);
    }

    public static void purple(String text) {
        colorize(35, text);
    }

    public static void cyan(String text) {
        colorize(36, text);
    }
}