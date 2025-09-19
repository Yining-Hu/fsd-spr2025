public class Login {
    private char readChoice(){
        System.out.print("Please select (L/A/X): ");
        return Config.IN.next().charAt(0);
    }

    private void help() {
        System.out.println("Menu options");
        System.out.println("L = Login into customer menu");
        System.out.println("A = Login to admin menu");
        System.out.println("X = exit");
    }

    public void menu(Bank bank, Manager manager) {
        System.out.println("Bank menu: "+Config.DTF.format(Config.NOW));
        char c;
        while((c = readChoice()) != 'X'){
            switch(c){
                case 'L': bank.customerLogin(); break;
                case 'A': manager.use(); break;
                default: help(); break;
            }
        }
        System.out.println("Done");
    }
    
    public static void main(String[] args) {
        Login loginSys = new Login();
        Bank bank = new Bank();
        Manager manager = new Manager(bank);

        loginSys.menu(bank, manager);
    }
    
}
