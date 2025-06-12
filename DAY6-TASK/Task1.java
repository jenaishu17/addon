package addon_day6;

public class Task1 {

	int mystack[]=new int[5];
	int top=-1;
	
	public void push(int val) {
        if (top < mystack.length)
        { 
            mystack[++top] = val;            
        } 
        else
        {
            System.out.println("Stack Overflow!");
        }
    }
	 public void pop() {
	        if (top >= 0)
	        { 
	            System.out.println("\nPopped: " + mystack[top--]); 
	        } 
	        else
	        {
	            System.out.println("Stack Underflow!");
	        }
	    }
	public void display() {
        if (top >= 0) 
        {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--)
            { 
                System.out.print(mystack[i] + " ");
            }
        } 
        else {
            System.out.println("Stack is Empty!");
        }
    }
	public static void main(String[] args) {
		Task1 s=new Task1();
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		s.display();
		s.pop();
		s.display();
	}
}
