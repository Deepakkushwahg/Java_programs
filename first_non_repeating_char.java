import java.util.Scanner;
public class first_non_repeating_char 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        for(int i=0;i<str.length();i++)
        {
            int c=0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i) == str.charAt(j))
                    c++;
            }
            if(c==1)
            {
                System.out.println("Index of first non repeating character in "+str+" is "+i);
                break;
            }
        }
    }
}
