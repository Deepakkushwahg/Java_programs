package Data_structure_and_algorithm.Graph_data_structure;

// depth first search (DFS) algo and implement a graph using adjacent list
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class adjacent_list
{
    void input(ArrayList<ArrayList<Integer>> arr, Scanner sc)
    {
        System.out.println("Enter the no. of edges");
        int e = sc.nextInt();
        for(int i=0;i<e;i++)
        {
            System.out.print("Enter value of x: ");
            int x = sc.nextInt();
            System.out.print("Enter value of y: ");
            int y = sc.nextInt();
            arr.get(x).add(y);
            arr.get(y).add(x);
        }
    }
    static void DFS(int i,boolean[] visit,ArrayList<ArrayList<Integer>> arr)
    {
        visit[i] = true;
        System.out.print(i+" ");
        Iterator<Integer> x = arr.get(i).listIterator();
        while(x.hasNext())
        {
            int n = x.next();
            if(!visit[n])
                DFS(n,visit,arr);
        }
    }
    static void TraversalOfGraph(ArrayList<ArrayList<Integer>> arr, int v,int i)
    {
        boolean visit[] = new boolean[v];
        DFS(i,visit,arr);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of vertices: ");
        int v = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            ArrayList<Integer> a = new ArrayList<>();
            arr.add(a);
        }
        new adjacent_list().input(arr,sc);
        System.out.println("adjacent list\n"+arr);
        System.out.println("DFS print");
        TraversalOfGraph(arr,v,1);
    }
}
