package lists.basic;

public class ListOfPoints {
    private Point head;

    public static void printAllPoints(Point point) {
        while (point != null) {
            System.out.println(point);
            point = point.getNext();
        }
    }

    public void add(Point point) {
        if (head == point) {
            head = point;
        } else {
            point.setNext(head);
            head = point;
        }
    }

    public Point pop() {
        Point point = head;
        head = head.getNext();
        return point;
    }

    public void printAllPoints() {
        Point copy = head;
        while (copy != null) {
            System.out.println(copy);
            copy = copy.getNext();
        }
    }

    public static void main(String[] args) {
        ListOfPoints list = new ListOfPoints();
        for (int i = 0; i < 10; i++) {
            list.add(new Point(i, i));
        }

        System.out.println("List of points:");
        printAllPoints(list.head);
        System.out.println("Popped point:");
        System.out.println(list.pop());
        System.out.println("New list of points:");
        printAllPoints(list.head);
    }
}

class Point {
    final double x, y;
    private Point next;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    public Point getNext() {
        return next;
    }

    public void setNext(Point next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y;
    }
}