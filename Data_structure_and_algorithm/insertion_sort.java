package Data_structure_and_algorithm;

import java.util.Scanner;

public class insertion_sort
{
    void sorting(int arr[],int size)
    {
        for(int i=1;i<size;i++)
        {
            int ele = arr[i];
            for(int j=i-1;j>=0;j--)
            {
                if(arr[j]>ele)
                {
                    arr[j+1] = arr[j];
                    arr[j] = ele;
                }
            }
        }
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the element");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        new insertion_sort().sorting(arr,size);
    }
}
