import java.util.Scanner;
public class all_odd_no_from_1_to_n 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);        
        int i,n;
        System.out.print("Enter the limit: ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2!=0)
                System.out.print(i+" ");
        }
    }
    
    
}
