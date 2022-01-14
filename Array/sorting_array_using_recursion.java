package Array;

import java.util.Scanner;

public class sorting_array_using_recursion
{
    Scanner sc = new Scanner(System.in);
    int n,k=1,j=0,arr[];
    sorting_array_using_recursion()
    {
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before sorting");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    void sortArray()
    {
        if(arr[j]>arr[j+1])
        {
            int t = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = t;
        }
        if(j<n-1-k)
        {
            j++;
            sortArray();
        }
        else if(k<n-1)
        {
            k++;
            j=0;
            sortArray();
        }
        else
        {
            System.out.println("Array after sorting");
            for(int i: arr)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        new sorting_array_using_recursion().sortArray();
    }
}
