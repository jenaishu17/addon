package addon_day6;

public class Task3 {
	    int arr[] = new int[5];
	    int rear;

	    public Task3() {
	        rear = 0; 
	        }

	    public void enqueue(int val) {
	        if (rear < arr.length) {
	            arr[rear++] = val;
	        } else {
	            System.out.println("Oops... Queue is Full!");
	        }
	    }

	    public void dequeue() {
	        if (rear == 0) {
	            System.out.println("Queue is Empty");
	        } else {
	            for (int i = 0; i < rear - 1; i++) {
	                arr[i] = arr[i + 1]; 
	            }
	            arr[--rear] = 0;  
	        }
	    }

	    public void display() {
	        System.out.println("Queue Elements:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	    public static void main(String[] args) {
	    	Task3 q = new Task3();
	        q.enqueue(34);
	        q.enqueue(10);
	        q.enqueue(62);
	        q.enqueue(45);
	        q.enqueue(2);
	        System.out.println("After enqueue operation");
	        q.display();
	        q.dequeue();
	        q.dequeue();
	        System.out.println("\nAfter dequeue operation");
	        q.display();
	    }
	}


