package shapes;

public class Rectangle {

    protected double length;
    protected double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void getArea(int length, int width){
        int area = length * width;
        System.out.println(area);
    }

    public void getPerimeter(int length, int width){
        int perimeter = 2 * length + 2 * width;
        System.out.println(perimeter);
    }




}
