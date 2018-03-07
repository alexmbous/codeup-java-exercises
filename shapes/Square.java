package shapes;

public abstract class Square extends Quadrilateral{
    protected double side;


    public Square() {
    }

    public Square(double side) {
        super(side,side);
        this.side = side;
    }

    public double getPerimeter(){
        return side * 4;
    }

    public double getArea(){
        return side * side;
    }


}
