package shapes;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Do you wanna build a circle?!");
        util.Input input = new util.Input();

        do {
            double radius = input.getInt("Enter a number that will be a radius for your circle:");

            Circle myCircle = new Circle(radius);

            System.out.println("This is the area: " + myCircle.getArea());

            System.out.println("This is the circumference: " + myCircle.getCircumference());

        } while(input.yesNo("Make another circle? (y/N)"));

        int circleCount = Circle.getCircleCount();
        System.out.println("This was fun. You created " + circleCount + " circles.");
    }


}
