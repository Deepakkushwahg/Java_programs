import java.util.Scanner;
public class even_odd
{
    int n;
    even_odd()
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
    }
    void display()
    {
        if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public static void main(String[] args)
    {
        even_odd obj = new even_odd();
        obj.display();
    }

}
