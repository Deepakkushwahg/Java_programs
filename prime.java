import java.util.Scanner;
public class prime 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,i,f=0;
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
                System.out.println("Not prime");
                break;
            }
        }
        if(f==0)
            System.out.println("Prime");
    }
}
