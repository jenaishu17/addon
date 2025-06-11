package addon_day5;

public class MainProgram {
	
		Node last;

		class Node{
			int data;
			Node next;
			Node(int val){
				data=val;
				next=null;	
			}
			}
		public MainProgram() {
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

	public static void main(String[] args) {
		MainProgram c=new MainProgram();
		c.insert(45);
		c.insert(2);
		c.insert(34);
		c.insert(26);
		c.insert(20);
		c.display();
		c.delete();
		c.display();
		c.deleteAtAnyPos(2);
		c.display();
	}
	}


