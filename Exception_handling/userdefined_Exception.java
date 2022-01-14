
import java.util.Scanner;

class AgeException extends Exception
{
    AgeException()
    {
        System.out.println("Under 18 age problem");
    }
}
public class userdefined_Exception
{
    void func1()
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the age");
            int age = scan.nextInt();
            if(age>=18)
            {
                System.out.println("Vote done");
            }
            else
            {
                throw new AgeException();
            }
        }
        catch(AgeException ae)
        {
            System.out.println(ae);
        }
        finally
        {
            System.out.println("Next vote will come");
        }
    }
    public static void main(String[] args) {
        userdefined_Exception obj = new userdefined_Exception();
        obj.func1();
    }
}
