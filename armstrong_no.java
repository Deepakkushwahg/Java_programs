import java.util.Scanner;
import java.lang.Math;
public class armstrong_no 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,x,z,r,p=0;
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        x=n;
        z=n;
        while(x>0)
        {
            x = x/10;
            p++;
        }
        x=0;
        while(n>0)
        {
            r = n%10;
            x = x + (int)Math.pow(r, p);
            n = n/10;
        }
        if(x==z)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Number is not Armstrong");
        
    }
    
}
