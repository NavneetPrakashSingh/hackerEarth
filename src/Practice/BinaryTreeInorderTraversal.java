package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int x) {
		val = x;
	}
}
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
    	
        List<Integer> inorderList = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        if(root == null) {
        	return inorderList;
        }
        
        if(root.left == null && root.right == null) {
        	inorderList.add(root.val);
        	return inorderList;
        }
        
       TreeNode tempNode = root;
       while(tempNode != null) {
    	   stack.add(tempNode);
    	   tempNode = tempNode.left;
       }
       while(!stack.isEmpty()) {
    	   TreeNode currentNode = stack.pop();
    	   inorderList.add(currentNode.val);
    	   
    	   currentNode = currentNode.right;
    	   while(currentNode!=null) {
    		   stack.add(currentNode);
    		   currentNode = currentNode.left;    		   
    	   }
       }
        
        return inorderList;
    }
    public static void main(String[] args) {
    	TreeNode node = new TreeNode(1);
    	node.right = new TreeNode(2);
    	node.right.left = new TreeNode(3);
    	BinaryTreeInorderTraversal btitObj = new BinaryTreeInorderTraversal();
    	System.out.println(btitObj.inorderTraversal(node));
    }
}
