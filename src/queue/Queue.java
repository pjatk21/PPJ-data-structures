package queue;

import lists.linkables.Student;

public class Queue {
    private Student head;
    private Student tail;

    public void add(Student student) {
        if (head == null) {
            head = student;
            tail = student;
        } else {
            tail.setNext(student);
            tail = student;
        }
    }

    public Student pop() {
        if (head == null) {
            return null;
        } else {
            Student student = head;
            head = (Student)head.getNext();
            return student;
        }
    }

    public void printAll() {
        Student copy = head;
        while (copy != null) {
            System.out.println(copy);
            copy = (Student)copy.getNext();
        }
    }

    public Student getHead() {
        return head;
    }

    public Student getTail() {
        return tail;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(new Student("John", 1));
        queue.add(new Student("Jane", 2));
        queue.add(new Student("Jack", 3));
        queue.add(new Student("Jill", 4));
        queue.add(new Student("Jim", 5));
        queue.add(new Student("Jenny", 6));
        queue.add(new Student("Juan", 7));
        
        System.out.println("Print all students:");
        queue.printAll();

        System.out.print("Popped:");
        System.out.println(queue.pop());

        System.out.println("Pop all students:");
        while (queue.getHead() != null) {
            System.out.println(queue.pop());
        }
        System.out.println("Try popping again:");
        System.out.println(queue.pop());
    }
}
