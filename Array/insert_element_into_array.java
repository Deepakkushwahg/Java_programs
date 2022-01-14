package Array;

import java.util.Scanner;
public class insert_element_into_array
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size+1];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the position where you want to insert : ");
        int pos = sc.nextInt();
        System.out.print("Enter the number for insertion : ");
        int num = sc.nextInt();
        for(int i=size-1;i>=pos-1;i--)
            arr[i+1]=arr[i];
        arr[pos-1]=num;
        for(int i : arr)
            System.out.print(i+" ");
    }
}
