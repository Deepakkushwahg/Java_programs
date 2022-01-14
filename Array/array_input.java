package Array;

import java.util.Scanner;
public class array_input 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the Elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
    
}
