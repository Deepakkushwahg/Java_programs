import java.util.Scanner;
class inputfact
{
    int i=1,n,x;
    inputfact()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=sc.nextInt();
    }
}
public class factorial extends inputfact
{
    void display()
    {
        x=n;
        while(n>0)
        {
            i=n*i;
            n--;
        }
        System.out.println("Factorial of "+x+" is "+i);
    }

    public static void main(String[] args) 
    {
        factorial obj = new factorial();
        obj.display();
        
    }
    
}
