package Practice;

import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Problem reference: https://leetcode.com/problems/same-tree/description/
 */
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int x) {
		val = x;
		left = right = null;
	}
}
public class SameBinaryTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	List<List<Integer>> firstTreeNode = new ArrayList<List<Integer>>();
    	List<List<Integer>> secondTreeNode = new ArrayList<List<Integer>>();
    	
    	if(p == null && q == null) {
    		return true;
    	}
    	
    	firstTreeNode =returnListFromTree(p);
    	secondTreeNode =returnListFromTree(q);
    	
    	if(firstTreeNode.equals(secondTreeNode)) {
    		return true;
    	}
        return false;
    }
    
     public List<List<Integer>> returnListFromTree(TreeNode node){
    	List<List<Integer>> tempList = new ArrayList<List<Integer>>();
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	if(node == null) {
    		return tempList;
    	}
    	queue.add(node);
    	while(!queue.isEmpty()) {
    		int queueSize = queue.size();
    		List<Integer> currentList = new ArrayList<Integer>();
    		for(int i=0;i<queueSize;i++) {
    			TreeNode currentNode = queue.poll();
    			currentList.add(currentNode.val);
    			if(currentNode.left!=null) {
    				queue.add(currentNode.left);
    			}else {
    				
    			}
    			if(currentNode.right!=null) {
    				queue.add(currentNode.right);
    			}
    		}
    		tempList.add(currentList);
    	}
    	return tempList;
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
		
		TreeNode node2 = new TreeNode(0);
		node2.left = new TreeNode(2);
		node2.left.left = new TreeNode(1);
		node2.left.left.left = new TreeNode(5);
		node2.left.left.right = new TreeNode(1);
		
		node2.right = new TreeNode(4);
		node2.right.right = new TreeNode(-1);
		node2.right.right.right = new TreeNode(8);
		node2.right.left = new TreeNode(3);
//		node2.right.left.right = new TreeNode(6);
		SameBinaryTree sbtObj = new SameBinaryTree();
		System.out.println(sbtObj.isSameTree(node, node2));
    }
}
