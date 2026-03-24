package test;

import java.util.*;

class Graph {

    List<Integer>[] list;

    // create graph
    Graph(int v) {
        list = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            list[i] = new ArrayList<>();
        }
        

    } 
	    // connect nodes
	    void addEdge(int a, int b) {
	        list[a].add(b);      // a → b
	        list[b].add(a);      // b → a (remove this for directed)
	    }
	    
	    void dfs(int node, boolean[] visited) {
	        visited[node] = true;
	        System.out.print(node + " ");

	        for (int n : list[node]) {
	            if (!visited[n]) {
	                dfs(n, visited);
	            }
	        }
	    }
	    // print graph
	    void printGraph() {
	        for (int i = 0; i < list.length; i++) {
	            System.out.print(i + " -> ");
	            for (int j : list[i]) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	    }
	
	    public static void main(String[] args) {
	
	        Graph g = new Graph(5);
	
	        // connect nodes
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        // print
        g.printGraph();
        
        boolean[] visited = new boolean[5];
        g.dfs(1, visited);   // start from 1
        
    }
}