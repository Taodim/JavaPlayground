package datastructureStackAndQueue;

public class Runner {

	public static void main(String[] args) {
		
		//STACK 
		Stack myStack = new Stack(3);
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		
		while(!myStack.isEmpty()) {
			long value = myStack.pop();
			System.out.println(value);
		}	

		//QUEUE
		Queue myQueue = new Queue(3);
		myQueue.insert(1);
		myQueue.insert(2);
		myQueue.insert(3);
		myQueue.insert(4);
		
		while(!myQueue.isEmpty()) {
			long value = myQueue.remove();
			System.out.println(value);
		}
		
		
		
		
	}
}
