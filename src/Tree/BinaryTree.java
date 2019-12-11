package Tree;
class Node{
	Node left, right;
	int value;
	public Node(int passedValue) {
		this.value = passedValue;
		left = right =null;
	}
}

class BinaryTree{
	Node node;
	public BinaryTree(int valueOfCurrentNode) {
		node = new Node(valueOfCurrentNode);
	}
	
}

