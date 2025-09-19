import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shapes {
    private List<Polygon> shapes;

    public static void main(String[] args) {
        new Shapes().show();
    }

    public Shapes() {
        this.shapes = new ArrayList<>();
        loadShapes();
    }

    private void loadShapes() {
        Random r = new Random();
        shapes.add(new Square(r.nextInt(9) + 1));
        shapes.add(new Square(r.nextInt(9) + 1));
        shapes.add(new Triangle(r.nextInt(9) + 1, r.nextInt(9) + 1));
        shapes.add(new Triangle(r.nextInt(9) + 1, r.nextInt(9) + 1));
    }

    private void show() {
        shapes.forEach(shape -> System.out.println(shape));
    }
}
