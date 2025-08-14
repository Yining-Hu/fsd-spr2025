public class Car {
    private String make;
    private int pos;

    // Constructor
    private Car() {
        this.make = "BMW";
        this.pos = 0;
    }

    private void move(int distance) {
        this.pos += distance;
    }

    @Override
    public String toString() {
        return this.make+" is at position "+this.pos;
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.printf("%s is at position: %d\n",myCar.make,myCar.pos);
        myCar.move(15);
        System.out.printf("%s is at position: %d\n",myCar.make,myCar.pos);
    }
}
