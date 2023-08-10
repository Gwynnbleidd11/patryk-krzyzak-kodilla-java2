package shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            return true;
        }
        return result;
    }

    public String getFigure(int n) {
        String shape = null;
        if (n >= 0 && n < shapes.size()) {
            shape = shapes.get(n).getShapeName();
        }
        return shape;
    }

    public String showFigures() {
        return shapes.toString();
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}
