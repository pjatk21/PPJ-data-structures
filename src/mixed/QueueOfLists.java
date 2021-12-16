package mixed;

import lists.linkables.Linkable;
import lists.linkables.Student;

public class QueueOfLists {
    private ListOfStudents head;
    private ListOfStudents tail;

    public void add(ListOfStudents los) {
        if (head == null) {
            head = los;
            tail = los;
        } else {
            tail.setNext(los);
            tail = los;
        }
    }

    public ListOfStudents pop() {
        if (head == null) {
            return null;
        } else {
            ListOfStudents returnValue = head;
            head = (ListOfStudents)head.getNext();
            return returnValue;
        }
    }

    public ListOfStudents getHead() {
        return head;
    }

    public ListOfStudents getTail() {
        return tail;
    }

    public static void main(String[] args) {
        // Create some lists
        ListOfStudents la = new ListOfStudents("Alpha");
        ListOfStudents lb = new ListOfStudents("Beta");
        ListOfStudents lc = new ListOfStudents("Gamma");
        // Add students to the lists
        la.add(new Student("John", 1));
        la.add(new Student("Jane", 2));
        la.add(new Student("Jack", 3));
        lb.add(new Student("Jill", 4));
        lb.add(new Student("Jim", 5));
        lb.add(new Student("Jenny", 6));
        lc.add(new Student("Juan", 7));
        lc.add(new Student("Joe", 8));
        // Create a queue
        QueueOfLists queue = new QueueOfLists();
        // Add the lists to the queue
        queue.add(la);
        queue.add(lb);
        queue.add(lc);
        // Print all students from the queue
        System.out.println("Print all students:");
        while (queue.getHead() != null) {
            var a = queue.pop();
            System.out.printf("List %s: %n", a.getName());
            while (a.getHead() != null) {
                System.out.println(a.pop());
            }
        }
    }
}

class ListOfStudents extends Linkable {
    private String name;
    private Student head;

    public ListOfStudents(String name) {
        this.name = name;
    }

    public void add(Student student) {
        if (student == null) {
            head = student;
        } else {
            student.setNext(head);
            head = student;
        }
    }

    public Student pop() {
        Student returnVal = head;
        head = (Student)head.getNext();
        return returnVal;
    }

    public String getName() {
        return name;
    }

    public Student getHead() {
        return head;
    }
}