import java.util.Scanner;
public class measurement_between_three_no 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the three numbers -");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a==b && b==c)
            System.out.println("All numbers are equal");
        else if(a!=b && b!=c && a!=c)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");
    }
}
