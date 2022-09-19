
public class STACK<E>implements IQueuable<E> {

	
	 private java.util.Stack<E> stack = new java.util.Stack<E>();
	    
     
	  public void enqueue(E e){
	    stack.push(e);
	  }

	  public E dequeue() {
	    return stack.pop();
	  }

	  public int getSize() {
	    return stack.size();
	  }

	  @Override
	  public String toString() {
	    return "Stack: " + stack.toString();
	  }

	public void push(String string) {
		// TODO Auto-generated method stub
		
	}}
