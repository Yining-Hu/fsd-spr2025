public abstract class Animal {
    protected int position;
    protected String type;
    
    public Animal(int position, String type) {
        this.position = position;
        this.type = type;
    }

    public abstract void walk();

    protected void show() {
        System.out.println(this.type + " is at position " + this.position);
    }  
}
