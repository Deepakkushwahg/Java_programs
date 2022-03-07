package Data_structure_and_algorithm;

import java.util.Scanner;

public class factorial_of_Number_using_Recursion
{
    static int fact = 1;
    public static void Factorial(int n)
    {
        fact = fact*n;
        n--;
        if(n>1)
            Factorial(n);
        else
            System.out.println("Factorial is "+fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre the number whose factorial you want: ");
        Factorial(sc.nextInt());
    }
}
