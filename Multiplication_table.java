import java.util.Scanner;
public class Multiplication_table 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }

        
    }
    
}
