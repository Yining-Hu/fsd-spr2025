public class Cat extends Animal {

    public Cat() {
        super(0,"Cat");
    }
    
    @Override
    public void walk() {
        this.position += 2;
    }
}
