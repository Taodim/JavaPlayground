package linkedList;
 

public class LinkedList {
	
	Node head;
	Node tail;
	
	public LinkedList(int data) {
		Node newNode = new Node(data);
		head = tail = newNode;
		newNode.next = null;
				
	}
	
	//insert to the end of list
	public void insertLast(int data) {
		Node aNode = new Node(data);
		tail.next = aNode;
		tail = aNode;
	}
	
	//insert to front of list
	public void insertFirst(int data) {
		Node aNode = new Node(data);
		aNode.next = head;
		head = aNode;
	}
	
	//Delete from beginning
	public void deleteFirst() {
		head = head.next;
	}
	
	//Display list
	public void displayList() {
		Node curNode = head;
		System.out.println("First ---> Last");
		while(curNode != null) {
			curNode.displayNode();
			curNode = curNode.next;
		}
	}
	
	
	//Check if Empty
	public boolean isEmpty() {
		return (head == null);
	}
	
	
}

