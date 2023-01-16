package Data_structure_and_algorithm.Graph_data_structure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Graph {
    LinkedList<Integer>[] adj;
    public Graph(int v){
        this.adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            this.adj[i] = new LinkedList<>();
        }
    }
    void addEdge(int u,int v)
    {
        this.adj[u].add(v);
        this.adj[v].add(u);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of vertices: ");
        int v = sc.nextInt();
        Graph g = new Graph(v);
        System.out.println("Enter no. of edges");
        int edges = sc.nextInt();
        System.out.println("Enter connected vertices");
        for(int i=0;i<edges;i++){
            g.addEdge(sc.nextInt(),sc.nextInt());
        }
        System.out.println("Depth first search");
        g.dfs(0,v);
    }
    private void dfs(int start,int v) {
        boolean[] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        while(!stack.isEmpty()){
            int u = stack.pop();
            if(!visited[u]){
                visited[u] = true;
                System.out.print(u+" ");
                for(int i : adj[u]){
                    if(!visited[i])
                        stack.push(i);
                }
            }
        }
    }
}
