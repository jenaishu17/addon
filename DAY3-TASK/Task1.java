package addon_day3;

public class Task1 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public Task1() {
        head = null;
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
        Task1 list = new Task1();
        list.head = list.new Node(45);
        list.head.next = list.new Node(62);
        list.head.next.next = list.new Node(34);
        list.display();
    }
}
