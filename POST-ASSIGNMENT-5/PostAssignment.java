package addon_day5;

import java.util.Scanner;
public class PostAssignment {
    Node last;

    class Node {
        int data;
        Node next;
        

        Node(int val) {
            data = val;
            next = null;
            
        }
    }

    public PostAssignment() {
        last = null;
    }

    public void insert(int val) {
		  Node newNode = new Node(val);
	      if (last == null) {
	          last = newNode;
	          last.next = last;
	      } else {
	          newNode.next = last.next;
	          last.next = newNode;
	      }
	}
    public void delete() {
		  if (last == null) {
	            System.out.println("List is empty, cannot delete!");
	            return;
	        }

	        if (last.next == last) 
	        { 
	            last = null;
	        } 
	        else {
	            last.next = last.next.next;
	        }
    }

    public void deleteAtAnyPos(int pos) {
        if (last == null || pos < 1) {
            System.out.println("Invalid position or list is empty!");
            return;
        }

        Node temp = last.next, prev = last;
        int count = 1;

        if (pos == 1) {
            delete();
            return;
        }

        do {
            if (count == pos) {
                prev.next = temp.next;
                if (temp == last) { 
                    last = prev;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
            count++;
        } while (temp != last.next);

        System.out.println("Position out of bounds!");
    }

    public void display() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = last.next;
        while (true) {
            System.out.print(temp.data + "->");
            temp = temp.next;
            if (temp == last.next) {
                break;
            }
        }
        System.out.println(last.next.data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PostAssignment list = new PostAssignment();
        int choice;

        do {
            System.out.println("\n1. Insert at Beginning");
            System.out.println("2. Delete from Beginning");
            System.out.println("3. Delete at any position");
            System.out.println("4. Display List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    list.insert(val);
                    break;
                case 2:
                	list.delete();                   
                    break;
                case 3:
                	System.out.print("Enter Position: ");
                    int pos = sc.nextInt();
                    list.deleteAtAnyPos(pos);
                    break;
                case 4:
                	list.display();
                    break;               
                case 5:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
}
