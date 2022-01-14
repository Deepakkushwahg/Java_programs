import java.util.Scanner;
//import java.lang.Math;
public class repeat_no_pattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        // for(int i=1;i<=size;i++)        
        // {
        //     System.out.println((int)Math.pow(10,i)/9*i);
        // }
        //                        or
        for(int i=1;i<=size;i++)
        {
            for(int j=0;j<i;j++)
                System.out.print(i);
            System.out.println();
        }
        
    }
    
}
