package Data_structure_and_algorithm;

import java.util.Scanner;

public class fibonacci_series_using_Recursion
{
    static int n;
    public static void Fibonacci(int a,int b)
    {
        int c = b;
        b = a+b;
        a = c;
        System.out.print(b+" ");
        if(n>3)
        {
            n--;
            Fibonacci(a,b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of series");
        n = sc.nextInt();
        if(n==1){
            System.out.println(0);
        }
        else if(n==2)
        {
            System.out.println(0+" "+1);
        }
        else if(n>2)
        {
            System.out.print(0+" "+1+" ");
            Fibonacci(0,1);
        }
        else
            System.out.println("Invalid");
    }
}
