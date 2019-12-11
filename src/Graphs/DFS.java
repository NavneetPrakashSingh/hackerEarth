package Graphs;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class DFS {
	
	int numberOfVertices;
	LinkedList<Integer>[] adjacencyList;
	
	public DFS(int v) {
		numberOfVertices = v;
		adjacencyList = new LinkedList[numberOfVertices];
		for(int i=0;i<numberOfVertices;i++) {
			adjacencyList[i] = new LinkedList<Integer>();
		}
	}
	
	public void printAdjacencyList() {
		for(int i=0;i<numberOfVertices;i++) {
			System.out.println(adjacencyList[i]);
		}
	}
	
	public void addEdge(int firstEdge, int secondEdge) {
		adjacencyList[firstEdge].add(secondEdge);
	}
	
	public void executeDFS(int startingNode) {
		Stack<Integer> stack = new Stack<Integer>();
		Vector<Boolean> visited = new Vector<Boolean>();
		
		for(int i=0;i<numberOfVertices;i++) {
			visited.add(false);
		}
		
		stack.push(startingNode);
		
		while(!stack.isEmpty()) {
			int currentElement =stack.pop();
			
			if(visited.get(currentElement)==false) {
				visited.set(currentElement, true);
				System.out.println(currentElement);
			}
			
			Iterator<Integer> iterateOverAdjacencyList = adjacencyList[currentElement].iterator();
			while(iterateOverAdjacencyList.hasNext()) {
				int nextElement = iterateOverAdjacencyList.next();
//				System.out.println(nextElement);
				if(visited.get(nextElement) == false) {
					stack.push(nextElement);
				}
			}
		}
	}

	public static void main(String[] args) {
		DFS dfs = new DFS(4);
		dfs.addEdge(0, 1);
		dfs.addEdge(0, 3);
		dfs.addEdge(2, 3);
		dfs.addEdge(1, 2);
		
		dfs.printAdjacencyList();
		dfs.executeDFS(1);
	}
}
