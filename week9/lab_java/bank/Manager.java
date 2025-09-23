package bank;

import utils.In;

public class Manager{
    private String name;
    
    public Manager()    {
       this.name = "John Smith";
    }

    private void view(Bank bank){
        bank.view();
    }
    
    private void show(Bank bank){
        bank.show();
    }
    
    private void remove(Bank bank){
        bank.remove();
    }
    
    private void add(Bank bank){
        bank.add();
    }
    
    private char readChoice(){
        System.out.print("Manager menu (a/r/s/v/x): ");
        return In.nextChar();
    }

    public void use(Bank bank) {
        System.out.println(name+" admin menu: "+Bank.DTF.format(Bank.NOW));
        char c;
        while((c = readChoice()) != 'x'){
            switch(c){
                case 'a': add(bank); break;
                case 'r': remove(bank); break;
                case 's': show(bank); break;
                case 'v': view(bank); break;
                default: help(); break;
            }
        }
        System.out.println("Back to Bank menu");
    }
    
    private void help() {
        System.out.println("Menu options");
        System.out.println("a = add a new customer");
        System.out.println("r = remove a customer");
        System.out.println("s = show customer statement");
        System.out.println("v = view all customers");
        System.out.println("x = exit");
    }
}