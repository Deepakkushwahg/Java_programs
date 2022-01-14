package Array;

import java.util.Scanner;
public class find_index_of_array_element 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the number whose index you want from given elements : ");
        int ele = sc.nextInt();
        System.out.print("Index of "+ele+" is/are ");
        for(int i=0;i<size;i++)
        {
            if(arr[i]==ele)
                System.out.print(i+" ");
        }
    }
}
