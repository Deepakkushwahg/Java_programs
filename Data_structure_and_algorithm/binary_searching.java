package Data_structure_and_algorithm;

import java.util.Scanner;

public class binary_searching
{
    int arr[],n,size;
    binary_searching()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the Elements");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the number which you want to search: ");
        n = sc.nextInt();
    }
    void searching()
    {
        int first = 0;
        int end = size-1;
        int mid = (first+end)/2;
        while(first<=end)
        {
            if(arr[mid]<n)
            {
                first = mid+1;
            }
            else if(arr[mid]>n)
            {
                end = mid-1;
            }
            else
            {
                System.out.println("Number is Found");
                break;
            }
            mid = (first+end)/2;
        }
        if(first>end)
            System.out.println("Not found");

    }
    public static void main(String[] args) {
        new binary_searching().searching();
    }
}
