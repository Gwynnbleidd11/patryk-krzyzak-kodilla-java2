package shape;

public class Square implements Shape {

    private double squareBase;
    private double squareHeight;


    public Square(double squareBase, double squareHeight) {
        this.squareBase = squareBase;
        this.squareHeight = squareHeight;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return squareBase * squareHeight;
    }

    public double getSquareBase() {
        return squareBase;
    }

    public double getSquareHeight() {
        return squareHeight;
    }
}
