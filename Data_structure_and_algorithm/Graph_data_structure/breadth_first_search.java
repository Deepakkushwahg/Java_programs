package Data_structure_and_algorithm.Graph_data_structure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class breadth_first_search
{
    void inputGraph(Scanner sc,ArrayList<ArrayList<Integer>> arr)
    {
        System.out.print("Enter the no. of edges: ");
        int edges = sc.nextInt();
        for(int i=0;i<edges;i++)
        {
            System.out.print("Enter value of x: ");
            int x = sc.nextInt();
            System.out.print("Enter value of y: ");
            int y = sc.nextInt();
            arr.get(y).add(x);
            arr.get(x).add(y);
        }
    }
    static void BFS(int x,int v,ArrayList<ArrayList<Integer>> arr)
    {
        boolean visit[] = new boolean[v];
        visit[x] = true;
        LinkedList<Integer> q = new LinkedList<>();
        q.add(x);
        while(!q.isEmpty())
        {
            int n = q.poll();
            System.out.print(n+" ");
            for(int i : arr.get(n))
            {
                if(!visit[i])
                {
                    visit[i] = true;
                    q.add(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of vertices of graph: ");
        int v = sc.nextInt();
        for(int i=0;i<v;i++)
        {
            ArrayList<Integer> a = new ArrayList<>();
            arr.add(a);
        }
        new breadth_first_search().inputGraph(sc,arr);
        BFS(1,v,arr);
    }
}
