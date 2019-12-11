package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import java.util.LinkedList;

/*
 * Problem reference: https://leetcode.com/problems/binary-tree-level-order-traversal/
 */


class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int x) {
		this.val = x;
		this.left = null;
		this.right = null;
				
	}
	
}

class BinaryTree {
	TreeNode currentNode;
	public BinaryTree(int x) {
		currentNode = new TreeNode(x);
	}
}

public class BFS {

	
	public List<List<Integer>> levelOrder(BinaryTree node){
		
		List<List<Integer>> returningList = new ArrayList<List<Integer>>();
		
		if(node == null) {
			return returningList;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(node.currentNode);
		
		while(!queue.isEmpty()) {
			int levelSize = queue.size();
			List<Integer> level = new ArrayList<Integer>();
			for(int i=0;i<levelSize;i++) {
				TreeNode currentNode = queue.poll();
				level.add(currentNode.val);
				
				if(currentNode.left!=null) {
					queue.add(currentNode.left);
				}
				if(currentNode.right != null) {
					queue.add(currentNode.right);
				}
			}
			returningList.add(level);
		}
		return returningList;

		
	}
	
	public static void main(String[] args) {
		
		BinaryTree node = new BinaryTree(3);
		node.currentNode.left = new TreeNode(9);
		node.currentNode.right =  new TreeNode(20);
		node.currentNode.right.right =  new TreeNode(7);
		node.currentNode.right.left = new TreeNode(15);
		
		BFS BFSObj = new BFS();
		List<List<Integer>> returnOutput = BFSObj.levelOrder(node);
		System.out.println(returnOutput);
	}
}
