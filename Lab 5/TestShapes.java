import java.util.ArrayList;

public class TestShapes {

    public static void drawShapes(ArrayList<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
	