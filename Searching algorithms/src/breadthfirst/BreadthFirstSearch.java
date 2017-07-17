package breadthfirst;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BreadthFirstSearch {

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

	public void bfs(int n, int edges, int nodes){
		boolean[] visited = this.initializeNode(nodes + 1);
		LinkedList<Integer>[] adj = this.addInAdjacentList(n, edges, nodes);

		this.bfsHelper(n);
	}

	public void bfsHelper(int n){
		visited[n] = true;
		Queue queue = new LinkedList();
		queue.add(n);

		while(queue.size() != 0){
			int s = (int) queue.poll();
			System.out.println(s + " ");

			for(int i = 0; i < adj[s].size(); i++){
				if(visited[adj[s].get(i)] == false){
					visited[adj[n].get(i)] = true;
					queue.add(adj[s].get(i));
				}
			}
		}
	}
}
