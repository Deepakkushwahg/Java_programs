package Data_structure_and_algorithm;

import java.util.Scanner;

public class quick_sort
{
    int partition(int arr[],int l,int r)
    {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=arr[r])
            {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                j++;
            }
        }
        return j-1;
    }
    void sorting(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int p = partition(arr,l,r);
            sorting(arr,l,p-1);
            sorting(arr,p+1,r);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        new quick_sort().sorting(arr,0,size-1);
        System.out.println("Array after sorting");
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
    }
}
