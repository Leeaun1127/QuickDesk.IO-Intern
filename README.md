B)	Instead of using arrays, both classes use different types of different data structures. 
Firstly, the “STACK” class implements from IQueuable interface which has all the methods to be inherited. 
However, I have implemented an instance of stack and named it “stack”. “stack” will implement the method of the interface 
and uses the methods of a stack of “push()”,” pop()” and ”getSize()”. This enables me to create a Last-in first-out queue.
As for the “QUEUE” class it is similar. However, I created an instance of Linklist. Since queue in the collection framework 
is an interface and Linklist is an concreate class. Therefore, I use Linklist to create the First-in First-out queue.


C)	Instead of implementing the getQueue() method to list all of the items in the queue. I override the toString method from 
object class so that it displays all the items in the queue by using the name of the object itself.
