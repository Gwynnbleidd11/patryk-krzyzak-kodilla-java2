package shape;

public class Triangle implements Shape {

    private double triangleBase;
    private double triangleHeight;

    public Triangle(double triangleBase, double triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return triangleBase * triangleHeight;
    }

    public double getTriangleBase() {
        return triangleBase;
    }

    public double getTriangleHeight() {
        return triangleHeight;
    }
}
