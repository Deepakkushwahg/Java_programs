package Data_structure_and_algorithm;

import java.util.Scanner;

public class Linear_search_using_Recursion
{
    int size,arr[],n;
    Linear_search_using_Recursion()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the Element");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the number which you want to search in Array: ");
        n = sc.nextInt();
    }
    void searching(int i)
    {
        if(n==arr[i])
        {
            System.out.println("Number is present at index "+i);
            return;
        }
        else if(i<size-1)
        {
            searching(++i);
        }
        else
            System.out.println("Number is not present");
    }
    public static void main(String[] args) {
        new Linear_search_using_Recursion().searching(0);
    }
}
