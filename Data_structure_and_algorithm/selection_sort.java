package Data_structure_and_algorithm;

import java.util.Scanner;

public class selection_sort
{
    void sorting(int arr[],int size)
    {
        for(int i=0;i<size-1;i++)
        {
            int min = i;
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]<arr[min])
                    min = j;
            }
            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Element");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        new selection_sort().sorting(arr,size);
    }
}
