public class Note {
    private int value;

    public Note(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "notes of $"+this.value;
    }

    public int getValue() {
        return this.value;
    }
}
