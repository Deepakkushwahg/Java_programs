import java.util.Scanner;

// reverse the given no. if -2^31<=number and reverse of that number <=2^31-1 than return true otherwise false
public class reverse_the_number
{
    public int reverse(int x) {
        if(x>=-Math.pow(2,31) && x<=Math.pow(2,31)-1)
        {
            int flag = 0;
            if(x<0)
            {
                x = -x;
                flag = 1;
            }
            long rev=0;
            while(x>0)
            {
                rev = (rev*10)+(x%10);
                x = x/10;
            }
            if(rev>=-Math.pow(2,31) && rev<=Math.pow(2,31)-1)
            {
                if(flag==1)
                {
                    return (int)-rev;
                }
                else
                    return (int)rev;
            }
            else
                return 0;

        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.println(new reverse_the_number().reverse(x));
    }
}