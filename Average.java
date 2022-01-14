import java.util.Scanner;
public class Average 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        float a,b,c,avg;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        avg = (a+b+c)/3;
        System.out.println("Average is "+avg);
    }
    
}
