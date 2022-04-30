package Data_structure_and_algorithm.Graph_data_structure;

import java.util.Scanner;

public class Dijsktra_algorithm
{
    static void InputElements(int[][] arr,Scanner sc)
    {
        System.out.print("Enter no. of edges: ");
        int e = sc.nextInt();
        for(int i=0;i<e;i++)
        {
            System.out.print("Enter the value of x: ");
            int x = sc.nextInt();
            System.out.print("Enter the value of y: ");
            int y = sc.nextInt();
            System.out.print("Enter the distance between them: ");
            int distance = sc.nextInt();
            arr[x][y] = distance;
            arr[y][x] = distance;
        }
    }
    static int minDistance(int[] distance,boolean[] visited,int v)
    {
        int min = Integer.MAX_VALUE;
        int min_index = -1;
        for(int i=0;i<v;i++)
        {
            if(visited[i]==false && distance[i]<=min)
            {
                min = distance[i];
                min_index = i;
            }
        }
        return min_index;
    }
    static void dijsktra(int[][] arr,int v,int vertices)
    {
        boolean visited[] = new boolean[v];
        int distance[] = new int[v];
        for(int i=0;i<v;i++)
        {
            distance[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        distance[vertices] = 0;
        for(int i=0;i<v-1;i++)
        {
            int u = minDistance(distance,visited,v);
            visited[u] = true;
            for(int j=0;j<v;j++)
            {
                if(!visited[j] && arr[u][j]!=0 && distance[u]!=Integer.MAX_VALUE && distance[u]+arr[u][j]<distance[j])
                {
                    distance[j] = distance[u]+arr[u][j];
                }
            }
        }
        System.out.println("Shortest distances for all vertices are");
        System.out.println("vertices\t\tdistances");
        for(int i=0;i<v;i++)
        {
            System.out.println(i+"\t\t\t\t"+distance[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vertices: ");
        int v = sc.nextInt();
        int[][] arr = new int[v][v];
        InputElements(arr,sc);
        dijsktra(arr,v,0);
    }

}
