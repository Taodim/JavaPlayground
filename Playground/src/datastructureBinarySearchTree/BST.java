package datastructureBinarySearchTree;

public class BST {

	private Node root;
	
	
	public void insert(int key, String value) {	
		Node newNode = new Node(key, value);
		if(root == null) {
			root = newNode;
		}else {
			Node current = root;
			Node parent;
			
			while(true) {
				parent = current;
				if(key < current.key) {
					current = current.leftChild;
					if(current == null) {
						parent.leftChild = newNode;
						return;
					}
				}else {
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}		
	}
	
	public boolean remove(int key) {
		Node curNode = root;
		Node parNode = root;
		
		boolean isLeftChild = false;
		
		//Searching to find node with key
		while(curNode.key!= key) {
			parNode = curNode;
			if(key<curNode.key) {
				isLeftChild = true;
				curNode = curNode.leftChild;
			}else {
				curNode = curNode.rightChild;
				isLeftChild = false;
			}
			
			if(curNode == null) return false;
 			
		}
		
		//if node is a leaf
		
		
		//if node has 1 child
		
		//if node has 2 children(fun stuff)
		
		
		return true;
	}
}
