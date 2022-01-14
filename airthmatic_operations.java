import java.util.Scanner;
public class airthmatic_operations 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        System.out.println(a+" + "+b+" = "+(a+( +b)));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" * "+b+" = "+a*b);
        System.out.println(a+" / "+b+" = "+a/b);
        System.out.println(a+" mod "+b+" = "+a%b);
    }
}
