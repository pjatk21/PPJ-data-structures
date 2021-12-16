package lists.linkables;
public class Student extends Linkable {
    private final String name;
    private final int number;

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "Student: " + name + ", number: " + number;
    }
}
