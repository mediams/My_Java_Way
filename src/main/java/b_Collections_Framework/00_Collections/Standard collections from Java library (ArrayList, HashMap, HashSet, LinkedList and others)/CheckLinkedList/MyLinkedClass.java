package CheckLinkedList;

public class MyLinkedClass {
    private int num;
    private MyLinkedClass next;

    public MyLinkedClass(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public MyLinkedClass getNext() {
        return next;
    }

    public void setNext(MyLinkedClass next) {
        this.next = next;
    }

    public static boolean hasCycle(MyLinkedClass head) {
        MyLinkedClass slow = head;
        MyLinkedClass fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        MyLinkedClass l1 = new MyLinkedClass(1);
        MyLinkedClass l2 = new MyLinkedClass(0);
        MyLinkedClass l3 = new MyLinkedClass(3);
        MyLinkedClass l4 = new MyLinkedClass(5);
        MyLinkedClass l5 = new MyLinkedClass(10);
        MyLinkedClass l6 = new MyLinkedClass(12);

        l1.setNext(l2);
        l2.setNext(l3);
        l3.setNext(l4);
        l4.setNext(l5);
        l5.setNext(l1);

        System.out.println(hasCycle(l1) ? "It's Cycle." : "It isn't Cycle.");
    }
}


