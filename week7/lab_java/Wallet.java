import java.util.*;

public class Wallet {
    private HashMap<Note, Integer> allNotes;
    private HashMap<Note, Integer> usedNotes;
    private List<Note> notes = new ArrayList<Note>();
    private Scanner in = new Scanner(System.in);
    
    public Wallet() {
        int[] values = {5, 10, 20, 50, 100};
        for (int value: values) {
            this.notes.add(new Note(value));
        }

        this.allNotes = stacked(10);
        this.usedNotes = stacked(0);
    }

    public HashMap<Note, Integer> stacked(int number) {
        HashMap<Note, Integer> stack = new HashMap<>();

        for (Note note: this.notes) {
            stack.put(note, number);
        }

        return stack;
    }

    private boolean isSufficient(int price) {
        int myTotal = 0;

        for (Note note: notes) {
            int numOfNotes = this.allNotes.get(note);
            myTotal = myTotal + note.getValue()*numOfNotes;
        }

        return myTotal >= price;
    }

    public HashMap<Note, Integer> pay(int price) {
        int numOfNotes;
        int value;
        HashMap<Note, Integer> usedNotes = new HashMap<>();

        for (int i=this.notes.size()-1; i>=0; i--) {
            value = this.notes.get(i).getValue();
            numOfNotes = price/value;
            if (numOfNotes <= 10) {
                price = price%value;
            } else {
                numOfNotes = 10;
                price = price - value*10;
            }
            usedNotes.put(this.notes.get(i), numOfNotes);
        }

        if (price > 0) {
            Note note5Dollar = this.notes.get(0);
            usedNotes.put(note5Dollar, usedNotes.get(note5Dollar)+1);
        }

        return usedNotes;
    }

    // show used notes
    public void show() {
        for (Note note: this.notes) {
            System.out.println("- used "+this.usedNotes.get(note)+" "+note.toString());
        }
    }

    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        myWallet.show();

        System.out.print("Enter the price: $");
        int price = myWallet.in.nextInt();

        if (myWallet.isSufficient(price)) {
            myWallet.usedNotes = myWallet.pay(price);
            myWallet.show();
        } else {
            System.out.println("Insufficient fund!");
        }
    }
}