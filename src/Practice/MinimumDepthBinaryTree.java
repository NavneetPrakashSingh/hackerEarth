package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import java.util.LinkedList;

/*
 * Practice problem: https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
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

class QueueItem{
	TreeNode node;
	int depth;
	
	public QueueItem(TreeNode currentNode, int currentDepth) {
		node = currentNode;
		depth = currentDepth;
	}
}

public class MinimumDepthBinaryTree {
	
	public int minDepth(TreeNode root) {
		
		List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		Queue<QueueItem> queue = new LinkedList<QueueItem>();
		List<Integer> leafNode = new LinkedList<Integer>();
		
		if(root == null) {
			return 0;
		}
		
		if(root.left == null && root.right == null) {
			return 1;
		}
		
		QueueItem qItem = new QueueItem(root, 1);
		queue.add(qItem);
		
		while(!queue.isEmpty()) {
			QueueItem currentNode = queue.poll();
			int depthOfCurrentNode = currentNode.depth;
			
			if(currentNode.node.left == null && currentNode.node.right == null) {

				return depthOfCurrentNode;
			}
			
			if(currentNode.node.right != null) {
				QueueItem currentItem = new QueueItem(currentNode.node.right, depthOfCurrentNode +1);
				queue.add(currentItem);
			}
			
			if(currentNode.node.left != null) {
				QueueItem currentItem = new QueueItem(currentNode.node.left, depthOfCurrentNode+1);
				queue.add(currentItem);
			}
		}
		
		
		
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println("Program starts...");
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(9);
		node.right = new TreeNode(20);
		node.right.left = new TreeNode(15);
		node.right.right = new TreeNode(7);
		
		MinimumDepthBinaryTree mdbtObj = new MinimumDepthBinaryTree();
		System.out.println(mdbtObj.minDepth(node));
	}
}
