package bank;

public class Manager{
    private String name;
    private Bank bank;
    
    public Manager(Bank bank)    {
       this.name = "John Smith";
       this.bank = bank;
    }

    private void view(){
        this.bank.view();
    }
    
    private void show(){
        this.bank.show();
    }
    
    private void remove(){
        this.bank.remove();
    }
    
    private void add(){
        this.bank.add();
    }
    
    private char readChoice(){
        System.out.print("Manager menu (a/r/s/v/x): ");
        return Config.IN.next().charAt(0);
    }

    public void use() {
        System.out.println(name+" admin menu: "+Config.DTF.format(Config.NOW));
        char c;
        while((c = readChoice()) != 'x'){
            switch(c){
                case 'a': this.add(); break;
                case 'r': this.remove(); break;
                case 's': this.show(); break;
                case 'v': this.view(); break;
                default: help(); break;
            }
        }
        System.out.println("Back to Bank menu");
    }
    
    private void help() {
        System.out.println("Menu options");
        System.out.println("a = add a new customer");
        System.out.println("r = remove a customer");
        System.out.println("s = show the selected customer statement");
        System.out.println("v = view all customers");
        System.out.println("x = exit");
    }
}