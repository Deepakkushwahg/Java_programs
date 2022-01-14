package Array;

public class prime_or_not_array
{
    public static void main(String[] args) 
    {
        int ar[] = {10,16,17,18,15,48,29,35};
        int c_prime=0,c_not_prime=0;
        for(int i=0;i<ar.length;i++)
        {
            int f=0;
            for(int j=2;j<ar[i];j++)
            {
                if(ar[i]%j==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
                c_prime++;
            else
                c_not_prime++;
        }
        System.out.println("No. of prime is "+c_prime);
        System.out.println("No. of not prime is "+c_not_prime);
    }
}
