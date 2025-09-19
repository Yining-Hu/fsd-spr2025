public class Square extends Polygon {

    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return String.format("%-8s area = %-6.2f", super.type, this.area());
    }
    
}
