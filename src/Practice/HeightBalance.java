package Practice;

/*
 * https://leetcode.com/problems/balanced-binary-tree/description/
 */
import java.util.*;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int x) {
		val = x;
	}
}

public class HeightBalance {
	
    public boolean isBalanced(TreeNode root) {
    	Queue<TreeNode> queue = new LinkedList<>();
    	
    	if(root == null) {
    		return true;
    	}
    	
    	if(root.left == null && root.right == null) {
    		return true;
    	}
    	
    	queue.add(root);
    	int leftHeight = 0, rightHeight = 0;
    	while(!queue.isEmpty()) {
    		TreeNode currentNode = queue.poll();
    		if(currentNode.left != null) {
    			queue.add(currentNode.left);    			
    		}
    		if(currentNode.right != null) {
    			queue.add(currentNode.right);    			
    		}
    	}
    	
    	System.out.println(rightHeight+"======="+leftHeight);
    	
    	if(Math.abs(rightHeight - leftHeight) <= 1) {
    		return true;
    	}
    	
    	return false;        
    }
	
	public static void main(String[] args) {
		System.out.println("Program starts...");
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(9);
		node.right = new TreeNode(20);
		node.right.left = new TreeNode(15);
		node.right.right = new TreeNode(7);
		node.right.right.right = new TreeNode(17);
		
		HeightBalance balance = new HeightBalance();
		System.out.println(balance.isBalanced(node));
	}
}
