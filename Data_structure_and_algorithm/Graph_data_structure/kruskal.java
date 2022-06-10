package Data_structure_and_algorithm.Graph_data_structure;

import java.util.Arrays;
import java.util.Scanner;

public class kruskal
{
    static class Edge implements Comparable<Edge>
    {
        int v1,v2,weight;
        Edge(int v1,int v2,int weight)
        {
            this.v1 = v1;
            this.v2 = v2;
            this.weight = weight;
        }
        public int compareTo(Edge edge)
        {
            return this.weight-edge.weight;
        }
    }
    static Edge[] Kruskal(Edge[] edgeArray,int v)
    {
        Arrays.sort(edgeArray);
        Edge mst[] = new Edge[v-1];
        int count=0,j=0;
        int parent[] = new int[v];
        for(int i=0;i<v;i++)
        {
            parent[i]=i;
        }
        while(count!=v-1)
        {
            Edge currentEdge = edgeArray[j++];
            int v1Parent = findParent(currentEdge.v1,parent);
            int v2Parent = findParent(currentEdge.v2,parent);
            if(v1Parent!=v2Parent)
            {
                mst[count] = currentEdge;
                count++;
                parent[v1Parent]=v2Parent;
            }
        }
        return mst;
    }
    static int findParent(int v1,int[] parent)
    {
        if(v1==parent[v1])
            return v1;
        return findParent(parent[v1],parent);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vertices: ");
        int v = sc.nextInt();
        System.out.print("Enter the edges: ");
        int e = sc.nextInt();
        Edge edgeArray[] = new Edge[e];
        for(int i=0;i<e;i++)
        {
            System.out.print("Enter v1: ");
            int v1 = sc.nextInt();
            System.out.print("Enter v2: ");
            int v2 = sc.nextInt();
            System.out.print("Enter the weight: ");
            int weight = sc.nextInt();
            Edge obj = new Edge(v1,v2,weight);
            edgeArray[i] = obj;
        }
        Edge mst[] = Kruskal(edgeArray,v);
        for(int i=0;i<mst.length;i++)
        {
            if(mst[i].v1<mst[i].v2)
            {
                System.out.println(mst[i].v1+"\t"+mst[i].v2+"\t"+mst[i].weight);
            }
            else
            {
                System.out.println(mst[i].v2+"\t"+mst[i].v1+"\t"+mst[i].weight);
            }
        }
    }
}
