import java.util.Scanner;
public class largest_among_three_no 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,largest;
        System.out.println("Enter three numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        largest = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("Largest among three is "+largest);
        
    }
    
}
