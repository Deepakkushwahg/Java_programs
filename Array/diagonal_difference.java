package Array;

import java.util.Scanner;
public class diagonal_difference
{
    Scanner sc = new Scanner(System.in);
    int n, arr[][];
    diagonal_difference()
    {
        System.out.println("Enter the size of matrix");
        n = sc.nextInt();
        arr = new int[n][n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    int display()
    {
        int s1=0,s2=0;
        for(int i=0;i<n;i++)
        {
            s1+=arr[i][i];
            s2+=arr[i][n-1-i];
        }
        return Math.abs(s1-s2);
    }
    public static void main(String args[])
    {
        System.out.println("Diagonal difference is "+new diagonal_difference().display());
    }
}