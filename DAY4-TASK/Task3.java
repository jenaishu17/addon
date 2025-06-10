package addon_day4;


public class Task3 {
	Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }

    public Task3() {
        head = null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        
    }
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    
    void insertAtMiddle(int data) {
        if (head == null) {
           
            insertAtBeginning(data);
            return;
        }

        Node slow = head;
        Node fast = head;

    
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

       
        Node newNode = new Node(data);

        newNode.next = slow.next;
        newNode.prev = slow;

        if (slow.next != null) {
            slow.next.prev = newNode;
        }

        slow.next = newNode;
    }
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
public void doubleDeleteAtBegin() {
        
        head = head.next; 
        if (head != null) {
            head.prev = null; 
        }
    }
void deleteAtMiddle() {
    if (head == null) {
        System.out.println("List is empty, nothing to delete.");
        return;
    }

    if (head.next == null) {
      
        head = null;
        return;
    }

    Node slow = head;
    Node fast = head;

    
    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    

    if (slow.prev != null) {
        slow.prev.next = slow.next;
    } else {
        
        head = slow.next;
    }

    if (slow.next != null) {
        slow.next.prev = slow.prev;
    }
}


    public static void main(String[] args) {
        Task3 list = new Task3();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.insertAtBeginning(1);
        System.out.println("Before Insert At Middle:\n");
        list.display(); 
        list.insertAtMiddle(15);
        list.insertAtMiddle(45);
        list.insertAtBeginning(3);
        System.out.println("\nBefore Delete At Middle:\n");
        list.display(); 
        System.out.println("\nAfter Delete At Middle:\n");
        list.deleteAtMiddle();
        list.display();  
    }
    
}
