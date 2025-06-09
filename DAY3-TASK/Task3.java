package addon_day3;

public class Task3 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public Task3() {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
    }

    public void deleteAtBegin() {
        if (head != null) {
            head = head.next;
        }
    }

    public void deleteAtAnyPos(int dpos) {
        if (head == null || dpos < 1) return;

        if (dpos == 1) {
            deleteAtBegin();
            return;
        }

        Node temp = head;
        Node dtemp = null;

        for (int i = 1; i < dpos; i++) {
            if (temp == null) return;
            dtemp = temp;
            temp = temp.next;
        }

        if (temp != null && dtemp != null) {
            dtemp.next = temp.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Task3 list = new Task3();
        list.display();
        list.deleteAtBegin();
        list.display();
        list.deleteAtAnyPos(2);
        list.display();
    }
}
