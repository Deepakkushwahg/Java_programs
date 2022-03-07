package Array;

// program to check number is present in array or not
import java.util.Scanner;

public class searching_in_Array
{
    int arr[],n,size;
    searching_in_Array()
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
    void searchingNumber()
    {
        int f=0;
        for (int i=0;i<size;i++)
        {
            if(n==arr[i])
            {
                System.out.println("Number is present in Array at "+(i+1)+" position and index no. is "+i);
                f=1;
                break;
            }
        }
        if(f==0)
            System.out.println("Number is not present in Array");
    }
    public static void main(String[] args) {
        new searching_in_Array().searchingNumber();
    }
}
