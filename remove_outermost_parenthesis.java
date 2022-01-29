import java.util.Scanner;

public class remove_outermost_parenthesis
{
    String st;
    remove_outermost_parenthesis()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of parenthesis");
        st = sc.next();
    }
    void display()
    {
        String s="";
        int c=0;
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)=='(')
            {
                c++;
                if(c>1)
                {
                    s=s+st.charAt(i);
                }
            }
            else
            {
                if(c>1)
                {
                    s=s+st.charAt(i);
                }
                c--;
            }
        }
        System.out.println("String after removing the outermost parenthesis");
        System.out.println(s);
    }
    public static void main(String[] args) {
        new remove_outermost_parenthesis().display();
    }
}