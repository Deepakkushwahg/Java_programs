import java.util.Scanner;
public class check_order_between_three_no 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the three numbers -");
        int a,b,c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if(a<b && b<c && a<c)
            System.out.println("Increasing order");
        else if(a>b && a>c && b>c)
            System.out.println("Decreasing order");
        else
            System.out.println("Neither increasing or decreasing order");
    }
}
