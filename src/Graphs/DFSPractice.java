package Graphs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class DFSPractice {
	
	int numberOfNodes;
	Map<Integer, List<Integer>> adjacencyList;
	Map<Integer, Boolean> visited;
	List<Integer> currentList;
	
	public DFSPractice(int x) {
		numberOfNodes =x;
		adjacencyList = new HashMap<Integer, List<Integer>>();
		visited = new HashMap<Integer, Boolean>();
	}
	
	public void addEdge(int firstEdge, int secondEdge) {
		
		if(adjacencyList.containsKey(secondEdge)) {
			List<Integer> currentList = adjacencyList.get(secondEdge);
			currentList.add(firstEdge);
			adjacencyList.put(secondEdge,currentList);
		}else {
			currentList = new ArrayList<Integer>();
			currentList.add(firstEdge);
			adjacencyList.put(secondEdge, currentList);
			
			currentList = new ArrayList<Integer>();
			currentList.add(secondEdge);
			adjacencyList.put(firstEdge, currentList);
			
		}
		
		if(adjacencyList.containsKey(firstEdge)) {
			List<Integer> currentList = adjacencyList.get(firstEdge);
			currentList.add(secondEdge);
			adjacencyList.put(firstEdge,currentList);
		}else {
			currentList = new ArrayList<Integer>();
			currentList.add(secondEdge);
			adjacencyList.put(firstEdge, currentList);
			
		}
	}
	
	public void DFS(int startingNode) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(startingNode);
		
		while(!stack.isEmpty()) {
			int currentElement = stack.pop();
			
			if(!visited.get(currentElement)) {
				visited.put(currentElement, true);
				System.out.println(currentElement);
				
				List<Integer> currentList = adjacencyList.get(currentElement);
				for(int i=0;i<currentList.size();i++) {
					stack.add(currentList.get(i));
				}
			}
			
		}
	}
	
	public void initializeVisitedNode() {
		adjacencyList.forEach((key,value) -> visited.put(key, false));
		System.out.println(visited);
	}
	
	
	public static void main(String[] args) {
		DFSPractice dfs = new DFSPractice(4);
		dfs.addEdge(1, 2);
		dfs.addEdge(1, 3);
		dfs.addEdge(2, 4);
		dfs.addEdge(3, 4);
		dfs.initializeVisitedNode();
		dfs.DFS(1);
	}

}
