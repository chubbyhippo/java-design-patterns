package composite;

import java.util.ArrayList;
import java.util.List;

public class ShapeGroup implements Shape {
    private final List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }
    @Override
    public void draw() {
        shapes.forEach(Shape::draw);
    }
}
