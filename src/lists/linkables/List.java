package lists.linkables;

public class List {
    private Student head;

    public List() {
        head = null;
    }

    public void add(Student student) {
        if (head == null) {
            head = student;
        } else {
            Linkable current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(student);
        }
    }

    public Student pop() {
        Student student = head;
        head = (Student)head.getNext();
        return student;
    }

    public void printAll() {
        Linkable current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

    public static void main(String[] args) {
        List list = new List();
        list.add(new Student("John", 1));
        list.add(new Student("Jane", 2));
        list.add(new Student("Jack", 3));
        list.add(new Student("Jill", 4));
        list.add(new Student("Joe", 5));
        list.add(new Student("Jenny", 6));
        list.add(new Student("Jill", 7));
        list.printAll();
        // Pop the first element
        System.out.println("Popped: " + list.pop());
        list.printAll();
    }
}