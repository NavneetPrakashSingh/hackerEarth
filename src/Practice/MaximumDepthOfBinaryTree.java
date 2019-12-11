package Practice;

import java.util.ArrayList;


import java.util.*;

/*
 * Problem reference: https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 */

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int x) {
		val = x;
	}
}

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
    	List<List<Integer>> listForTree = new ArrayList<List<Integer>>();
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	
    	if(root == null) {
    		return 0;
    	}
    	
    	if(root.left == null && root.right == null) {
    		return 1;
    	}
    	
    	queue.add(root);
    	
    	while(!queue.isEmpty()) {
    		int levelSize = queue.size();
    		List<Integer> level= new ArrayList<Integer>();
    		for(int i=0;i<levelSize;i++) {
        		TreeNode currentNode = queue.poll(); 

    			if(currentNode.left!=null) {
    				queue.add(currentNode.left);
    			}
    			
    			if(currentNode.right != null) {
    				queue.add(currentNode.right);
    			}
    			level.add(currentNode.val);
    		}
    		listForTree.add(level);
    	}
    	
        return listForTree.size();
    }
    
	public static void main(String[] args) {
		TreeNode node = new TreeNode(0);
		node.left = new TreeNode(2);
		node.left.left = new TreeNode(1);
		node.left.left.left = new TreeNode(5);
		node.left.left.right = new TreeNode(1);
		
		node.right = new TreeNode(4);
		node.right.right = new TreeNode(-1);
		node.right.right.right = new TreeNode(8);
		node.right.left = new TreeNode(3);
		node.right.left.right = new TreeNode(6);
		
		MaximumDepthOfBinaryTree mdobtObj = new MaximumDepthOfBinaryTree();
		System.out.println(mdobtObj.maxDepth(node));
	}
}
