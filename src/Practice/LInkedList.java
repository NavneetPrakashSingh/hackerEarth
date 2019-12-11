package Practice;
/*
 * Question link: https://leetcode.com/problems/design-linked-list/
 */

class Node{
	int val;
	Node next;
	Node(int x){
		val = x;
		next = null;
	}
	Node(){
		next = null;
	}
}

class MyLinkedList {

	Node head;
	Node currentList;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        currentList = new Node();
        head = new Node();
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        return 0;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
    	
        head.val = val;
        head.next = currentList;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
    	Node addNode = new Node(val);
        Node tempNode = new Node();
        
        while(currentList.next!=null) {
        	tempNode = currentList;
        }
        currentList.next = addNode;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        
    }
    
    /*
     * Custom function
     */
    public void printList() {
    	while(currentList.next!=null) {
    		System.out.println(currentList.val);
    	}
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

public class LInkedList {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.addAtTail(1);
		list.printList();
	}
}
