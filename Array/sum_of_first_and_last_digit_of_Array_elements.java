package Array;

import java.util.Scanner;

public class sum_of_first_and_last_digit_of_Array_elements
{
    Scanner sc = new Scanner(System.in);
    int n,arr[];
    sum_of_first_and_last_digit_of_Array_elements()
    {
        System.out.println("Enter the size of Array");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter Array Elements length should be greater than 1");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            System.out.print(sum_of_first_and_last_digit(arr[i])+" ");
        }
    }
    static int sum_of_first_and_last_digit(int digit)
    {
        int d=0,z=digit;
        while(z>0)
        {
            z=z/10;
            d++;
        }
        return digit%10+digit/(int)Math.pow(10,d-1);
    }
    public static void main(String[] args) {
        new sum_of_first_and_last_digit_of_Array_elements();
    }
}
