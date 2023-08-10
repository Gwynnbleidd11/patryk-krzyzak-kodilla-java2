package shape;

public class Circle implements Shape {

    double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.PI * circleRadius * circleRadius;
    }

    public double getRadius() {
        return circleRadius;
    }
}
