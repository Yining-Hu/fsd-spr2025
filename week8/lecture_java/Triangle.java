public class Triangle extends Polygon{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        super("Triangle");
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        return (this.base * this.height) / 2;
    }
   
    @Override
    public String toString() {
        return String.format("%-8s area = %-6.2f",super.type,this.area());
    }
}
