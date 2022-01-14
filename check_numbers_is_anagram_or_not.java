import java.util.Scanner;
public class check_numbers_is_anagram_or_not 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        int x=a,c1=0,c2=0,y=b;
        while(x>0)
        {
            x=x/10;
            c1++;
        }
        while(y>0)
        {
            y=y/10;
            c2++;
        }
        if(c1==c2)
        {
            int arr[] = new int[c1];
            for(int i=0;i<c1;i++)
            {
                arr[i]=b%10;
                b=b/10;
            }
            int c=0;
            for(int i=0;i<c1;i++)
            {
                int r=a%10;
                for(int j=0;j<c2;j++)
                {
                    if(r==arr[j])
                    {
                        for(int k=j;k<c2-1;k++)
                            arr[k]=arr[k+1];
                        c++;
                        c2--;
                        break;
                    }
                }
                a=a/10;
            }
            if(c==c1)
                System.out.println("Number is anagram");
            else
                System.out.println("Number is not anagram");
        }
        else
            System.out.println("Number is not anagram");
    } 
}
