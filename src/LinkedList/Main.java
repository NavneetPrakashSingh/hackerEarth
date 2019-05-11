package LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.push(1);
		linkedList.push(2);
//		linkedList.insertAtEnd(3);
		linkedList.insertAtPosition(4, 2);
		linkedList.printLinkedList();
	}
}
