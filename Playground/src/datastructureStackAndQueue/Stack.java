package datastructureStackAndQueue;

public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top = -1;
	}
	
	public boolean isFull() {
		return(maxSize-1 == top);
	}
	
	public void push(long i){
		if (isFull()) {
			System.out.println("Stack is full");
		}
		else {
			top++;
			stackArray[top] = i;
	
		}
	}
	
	public long pop() {
		if(isEmpty()) {
			System.out.println("No more item, stack empty");
			return -1;
		}
		else {
			int oldTop = top;
			top--;
			return stackArray[oldTop];
		}
		
	}
	
	public long peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return(top == -1);
	}
	
	
}
