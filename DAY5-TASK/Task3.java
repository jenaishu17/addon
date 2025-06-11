package addon_day5;

public class Task3 {
	Node last;

	class Node{
		int data;
		Node next;
		Node(int val){
			data=val;
			next=null;	
		}
		}
	public Task3() {
		last=null;
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
	public void display() {
		
		Node temp = last.next;
	    do {
	        System.out.print(temp.data + "->");
	        temp = temp.next;
	        if(temp==last.next) {
	        	System.out.print("null\n");
	        }
	    } while (temp != last.next);

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
public static void main(String[] args) {
	Task3 c=new Task3();
	c.insert(45);
	c.insert(2);
	c.insert(34);
	c.insert(26);
	c.insert(20);
	c.display();
	c.delete();
	c.display();
}
}
