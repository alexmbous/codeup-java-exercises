package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myshape = new Rectangle(5,10);
        Rectangle box1 = new Rectangle(4 , 5);

        System.out.println("box1 perimeter = " + box1.getPerimeter());
        System.out.println("box1 area = " + box1.getArea());

        System.out.println("myshape perimeter = " + myshape.getPerimeter());
        System.out.println("myshape area = " + myshape.getArea());



    }
}
