public class Student {
    private int Id;
    private int mark;
    private String grade;

    public Student(int Id, int mark) {
        this.Id = Id;
        this.mark = mark;
        this.grade = grade(mark);
    }

    private String grade(int mark) {
        return mark >= 85 ? "HD" : mark >= 75 ? "D" : mark >= 65 ? "C" : mark >= 50 ? "P" : "Z";
    }
    
    public boolean match(int ID) {
        return this.Id == ID;
    }

    public int getMark() {
        return this.mark;
    }

    public String getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return String.format("Student-%03d [%2d --> %2s]", Id, mark, grade);
    }
}
