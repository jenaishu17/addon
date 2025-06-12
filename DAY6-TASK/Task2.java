package addon_day6;

import java.util.Scanner;

public class Task2 {
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
            System.out.println("Popped: " + mystack[top--]); 
        } 
        else
        {
            System.out.println("Stack Underflow!");
        }
    }
 public void peek() {
	 if(top>=0) {
		 System.out.println("Top Value:"+mystack[top]);
	 }
	 else {
		 System.out.println("Stack is Empty!");
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
	Scanner sc = new Scanner(System.in);
	Task2 s =new Task2();
	int choice ;
	System.out.println("STACK OPERATIONS");
	System.out.println("Options");
	do {
	System.out.println("\n1.Push");
	System.out.println("2.Pop");
	System.out.println("3.Peek");
	System.out.println("4.Display");
	System.out.println("5.Exit");
	System.out.println("Enter Your Choice:");
	choice=sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("Enter the value");
		int val=sc.nextInt();
		s.push(val);
		break;
	case 2:
		s.pop();
		break;
	case 3:
		s.peek();
		break;
	case 4:
		s.display();
		break;
	case 5:
		System.out.println("Exiting....🖐🏻");
		System.exit(0);
	default:
		System.out.println("Invalid Choice");
	}
	}while(choice!=5);
	
	sc.close();
}
}
