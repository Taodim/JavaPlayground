package linkedList;

public class Runner {

	public static void main(String[] args) {
		//Testing non-listed Nodes
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		
		node1.next = node2;
		node2.next = node3;
	
		
		//LinkedList
		LinkedList myList = new LinkedList(1);
		myList.insertLast(2);
		myList.insertLast(3);
		myList.insertLast(4);
		myList.insertLast(5);
		//displaylist
		myList.displayList();
		
	}
	
	
	
	
	
	
	
	
	
	//find the length of linked nodes after the given node
	public static int listLength(Node aNode) {
		int counter = 0;
		Node curNode = aNode;
		
		while(!(curNode == null)) {
			curNode = curNode.next;
			counter++;
		}
				
		return counter;
	}

	
	
	
}
