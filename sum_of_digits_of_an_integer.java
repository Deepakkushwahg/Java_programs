import java.util.Scanner;
public class sum_of_digits_of_an_integer 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);        
        int n, s=0;
        System.out.print("Enter the integer: ");
        n = sc.nextInt();
        while(n>0)
        {
            s = s+n%10;
            n=n/10;
        }
        System.out.println("Sum of digits is "+s);
    }
    
}
