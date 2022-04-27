package Data_structure_and_algorithm;

import java.util.Scanner;

public class adjacent_matrix
{
    void input(int[][] matrix, int e, int v,Scanner sc)
    {
        for(int i=0;i<e;i++)
        {
            System.out.print("Enter value of x: ");
            int x = sc.nextInt();
            System.out.print("Enter value of y: ");
            int y = sc.nextInt();
            matrix[x][y] = 1;
            matrix[y][x] = 1;
        }
    }
    static void PrintMatrix(int[][] matrix,int v)
    {
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of vertices: ");
        int v = sc.nextInt();
        int[][] matrix = new int[v][v];
        System.out.print("Enter no. edges: ");
        int e = sc.nextInt();
        new adjacent_matrix().input(matrix,e,v,sc);
        PrintMatrix(matrix,v);
    }
}
