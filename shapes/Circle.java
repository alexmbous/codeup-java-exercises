package shapes;

    public class Circle {
        private double radius;
        private static int numberOfCircles;

        public Circle(double radius) {
            this.radius = radius;
            numberOfCircles++;
        }

        public double getArea() {
            return Math.PI * (radius * radius);
        }

        public double getCircumference() {
            double circumference = 2 * (Math.PI * radius);
            return circumference;
        }

        public static int getCircleCount() {
            return numberOfCircles;
        }




}
