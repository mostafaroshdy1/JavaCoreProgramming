import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(5, 3));
        rectangles.add(new Rectangle(7, 2));

        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(4));
        circles.add(new Circle(6));

        TestShapes.drawShapes(rectangles);
        TestShapes.drawShapes(circles);

        ArrayList<Shape> mixedShapes = new ArrayList<>();
        mixedShapes.addAll(rectangles);
        mixedShapes.addAll(circles);
        TestShapes.drawShapes(mixedShapes);
    }
}
