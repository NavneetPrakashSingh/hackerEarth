package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/*
 * Problem reference: https://leetcode.com/problems/symmetric-tree/description/
 */

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int x) {
		val = x;
	}
}
public class BinaryTreeMirrorOfItself {
    public boolean isSymmetric(TreeNode root) {
    	List<Integer> leftSide = new ArrayList<Integer>();
    	List<Integer> rightSide = new ArrayList<Integer>();
    	
    	leftSide = inorderTraversal(root.left);
    	rightSide = inorderTraversal(root.right);
    	Collections.reverse(rightSide);
    	if(leftSide.equals(rightSide)) {
    		return true;
    	}
        return false;
    }
    
    public List<Integer> inorderTraversal(TreeNode node){
    	List<Integer> returningList = new ArrayList<Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	
    	if(node==null) {
    		return returningList;
    	}
    
    	TreeNode tempNode = node;
    	while(tempNode!=null) {
    		stack.push(tempNode);
    		tempNode = tempNode.left;
    	}
    	
    	
    	while(!stack.isEmpty()) {
    		TreeNode currentNode = stack.pop();
    		returningList.add(currentNode.val);
    		
    		currentNode = currentNode.right;
    		while(currentNode!= null) {
    			stack.push(currentNode);
    			
    			currentNode = currentNode.left;
    		}
    		
    	}
    	
    	return returningList;
    }
    
 
	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(2);
		node.left.left = new TreeNode(2);
		node.right.left = new TreeNode(2);
		
		BinaryTreeMirrorOfItself btmObj = new BinaryTreeMirrorOfItself();
		System.out.println(btmObj.isSymmetric(node));
	}
}
