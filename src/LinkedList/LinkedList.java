package LinkedList;

public class LinkedList {
	Node head;
	
	//insert at the start of the node
	public void push(int newData) {
		Node nodeAtStart = new Node(newData);
		nodeAtStart.next = head;
		head = nodeAtStart;
	}
	//insert at the end of the node
	public void insertAtEnd(int dataForNode) {
		Node newNode = new Node(dataForNode);
		
		Node lastNode = head;
		if(lastNode == null) {
			push(newNode.data);
			return;
		}
		while(lastNode.next!=null) {
			lastNode = lastNode.next;
		}
		lastNode.next = newNode;
		
	}
	//insert at nth position of the node
	public void insertAtPosition(int dataForNode, int positionForNode) {
		Node currentNode = head;
		Node nodeToBeInserted = new Node(dataForNode);
		int countForNode = 0;
		while(currentNode.next != null) {
			if(countForNode == positionForNode) {
//				nodeToBeInserted.next = currentNode.next;
//				currentNode.next = nodeToBeInserted;
				System.out.println("Count for node is"+countForNode+ "current value of node"+ currentNode.data);
			}
			countForNode ++;
		}
	}
	
	//print linked list
	public void printLinkedList() {
		System.out.println("Printing Linked List");
		Node headNode = head;
		while(headNode!=null) {
			System.out.println(headNode.data+" ");
			headNode = headNode.next;
		}
	}

}
