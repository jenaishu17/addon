package addon_day5;

public class Task1 {
Node last;

class Node{
	int data;
	Node next;
	Node(int val){
		data=val;
		next=null;	
	}
	}
public Task1() {
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
        	System.out.print("null");
        }
    } while (temp != last.next);

 }

public static void main(String[] args) {
	Task1 c=new Task1();
	c.insert(45);
	c.insert(2);
	c.insert(34);
	c.insert(26);
	c.insert(20);
	c.display();
}

}


