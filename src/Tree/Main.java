package Tree;

public class Main {
	public static void main(String[] args) {
		BinaryTree root = new BinaryTree(10);
		root.node.left = new Node(1);
		root.node.right = new Node(2);
		
		System.out.println(root.node.value);
	}
}
