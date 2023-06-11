package Data_structure_and_algorithm.Graph_data_structure;

import java.util.HashMap;
import java.util.Scanner;

public class graph_using_hashmap {
    HashMap<Integer, HashMap<Integer, Integer>> map;
    public graph_using_hashmap(int v){
        map = new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1 , int v2, int cost){
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean containEdge(int v1,int  v2){
        return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
    }

    public boolean containVertex(int v1){
        return map.containsKey(v1);
    }

    public int numberOfEdges(){
        int sum = 0;
        for(int key : map.keySet()){
            sum += map.get(key).size();
        }
        return sum / 2;
    }

    public void removeEdge(int v1, int v2){
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }

    public void removeVertex(int v1){
        for(int key : map.get(v1).keySet()){
            map.get(key).remove(v1);
        }
        map.remove(v1);
    }

    public void display(){
        System.out.println("Graph representaion\n");
        for(int key : map.keySet()){
            System.out.println(key +"--->"+ map.get(key));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int v = sc.nextInt();
        graph_using_hashmap graph = new graph_using_hashmap(v);
        System.out.println("Enter the v1 , v2 and cost");
        for(int i=0;i<v;i++){
            graph.addEdge(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        System.out.println("Number of edges = "+ graph.numberOfEdges());
        graph.display();
        System.out.println("Enter v1 and v2 in which you want to remove edge");
        graph.removeEdge(sc.nextInt(), sc.nextInt());
        System.out.println("Enter the vertex which you want to remove");
        graph.removeVertex(sc.nextInt());
        System.out.println("Number of edges after update = "+ graph.numberOfEdges());
        graph.display();
    }
}
