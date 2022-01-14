package regex;
import java.util.Scanner;
import java.util.regex.Pattern;

class Exception_throw extends Exception
{
    Exception_throw()
    {
        System.out.println("Wrong email format");
    }
}
public class email_address
{
    Scanner scan = new Scanner(System.in);
    String st;
    email_address()
    {
        System.out.println("Enter the string");
        st = scan.next();
    }
    void display()
    {
        try
        {
            if(Pattern.matches("[a-z0-9_.]+[@][g][m][a][i][l][.][c][o][m]",st))
            {
                System.out.println("Correct email format");
            }
            else
                throw new Exception_throw();
        }
        catch(Exception_throw et)
        {
        }
    }
    public static void main(String[] args) {
        email_address obj = new email_address();
        obj.display();
    }
}
