package datastructureStackAndQueue;

public class Queue {
	private int maxSize;
	private long[] qArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int size) {
		this.maxSize = size;
		this.qArray = new long[size];
		front = 0;
		rear = -1;
		nItems = 0;
		
	}
	
	public boolean isFull() {
		return(nItems == maxSize);
	}
	
	public void insert(long i){
		if (isFull()) { 
			System.out.println("Queue is full");
		}
		else {
			rear++;
			qArray[rear] = i;
			nItems++;
	
		}
	}
	
	public long remove() {
		if(isEmpty()) {
			System.out.println("No more item, queue empty");
			return -1;
		}
		else {
			long temp = qArray[front];
			front++;
			if (front == maxSize) { //if q becomes empty, reset array index
				front = 0;
				rear = -1;
			}
			
			nItems--;
			return temp;			
		}
		
	}
	
	public long peekFront() {
		return qArray[front];
	}
	
	public boolean isEmpty() {
		return(nItems == 0);
	}
}
