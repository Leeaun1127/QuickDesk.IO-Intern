

public class app {

	public static void main(String[] args) {
		
		
		STACK<String> stack = new STACK<>();
		 
	    stack.enqueue("Tom"); 
	    System.out.println("(1) " + stack);

	    stack.enqueue("Susan"); // Push it to the the stack
	    System.out.println("(2) " + stack);
	    stack.enqueue("Kim"); // Push it to the stack
	    stack.enqueue("Michael"); // Push it to the stack
	    System.out.println("(3) " + stack);

	    // Remove elements from the stack
	    System.out.println("(4) " + stack.dequeue());
	    System.out.println("(5) " + stack.dequeue());
	    System.out.println("(6) " + stack);

	    
	    
	    
		QUEUE<String> queue = new QUEUE<>(); //first-in first-out
	    // Add elements to the queue
	    queue.enqueue("Tom"); // Add it to the queue
	    System.out.println("(7) " + queue);

	    queue.enqueue("Susan"); // Add it to the queue
	    System.out.println("(8) " + queue);

	    queue.enqueue("Kim"); // Add it to the queue
	    queue.enqueue("Michael"); // Add it to the queue
	    System.out.println("(9) " + queue);

	    // Remove elements from the queue
	    System.out.println("(10) " + queue.dequeue()); //removes the first element
	    System.out.println("(11) " + queue.dequeue()); // removes the second element
	    
	    
	    
	    
		

	}

}
