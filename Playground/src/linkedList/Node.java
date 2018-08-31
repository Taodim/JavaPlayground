package linkedList;

public class Node {
	private int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	//GetSet
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	//Print out data on given node
	public void displayNode() {
		System.out.print("[Data: " + this.getData() + "]->");
	}

	
	
}
