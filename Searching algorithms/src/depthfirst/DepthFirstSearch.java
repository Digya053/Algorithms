package depthfirst;

import java.util.LinkedList;
import java.util.Scanner;

public class DepthFirstSearch {
	
	LinkedList<Integer> adj[];
	boolean[] visited;

	private boolean[] initializeNode(int n){
		visited = new boolean[n];
		for(int i = 0; i < n; i++){
			visited[i] = false;
		}
		return visited;
	}

	private LinkedList<Integer>[] createLists(int n){
		
		adj = new LinkedList[n];

		for(int i = 0; i < adj.length; ++i){
			adj[i] = new LinkedList<Integer>();
		}
		return adj;
	}

	public LinkedList<Integer>[] addInAdjacentList(int n, int edges, int nodes){
		int x, y;

		LinkedList<Integer>[] adj = this.createLists(nodes + 1);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the coordinates of edges");
		for(int i = 0; i < edges; i++){
			x = scanner.nextInt();
			y = scanner.nextInt();

			adj[x].add(y);
		}

		return adj;
	}


	public void dfs(int n, int edges, int nodes){

		LinkedList<Integer>[] adj = this.addInAdjacentList(n, edges, nodes);
		
		boolean visited[] = this.initializeNode(nodes + 1);
	
		System.out.println("The depth first traversal is: ");
		this.dfsHelper(n);
	
	}
	
	public void dfsHelper(int n){
		visited[n] = true;
		System.out.println(n + " ");
		for(int i = 0; i < adj[n].size(); i++){
			if(visited[adj[n].get(i)] == false){
				dfsHelper(adj[n].get(i));
			}
		}
	}
}
