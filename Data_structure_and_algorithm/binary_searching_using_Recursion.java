package Data_structure_and_algorithm;

import java.util.Scanner;

public class binary_searching_using_Recursion
{
    static int size,arr[],n;
    binary_searching_using_Recursion()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the Element in sorted order");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the Element which you want to search: ");
        n = sc.nextInt();
    }
    String searching(int first,int last)
    {
        int mid = (first+last)/2;
        if(n==arr[mid])
            return "Number is found";
        if(n>arr[mid])
            first = mid+1;
        else
            last = mid-1;
        if(first>last)
            return "Not found";
        return searching(first,last);
    }
    public static void main(String[] args) {
        System.out.println(new binary_searching_using_Recursion().searching(0,size-1));
    }
}
