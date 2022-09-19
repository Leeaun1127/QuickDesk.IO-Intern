
public interface IQueuable<E> {

	
	public void enqueue(E e); //add value to queue and returns new queue
	public E dequeue(); // removes item from queue, and returns the item removed
	public int getSize(); // returns the number of items in the queue
	public String toString();//
}
