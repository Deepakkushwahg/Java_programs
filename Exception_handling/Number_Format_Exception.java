import java.util.Scanner;

public class Number_Format_Exception
{
    void func1()
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the value");
            String var = scan.next();
            System.out.println("string value: ");
            System.out.println(var+5);
            int z=Integer.parseInt(var);
            System.out.println("Integer value: ");
            System.out.println(z+5+" ...................try block");
        }
        catch(Exception obj)
        {
            System.out.println(obj.getMessage()+"       ......................catch block");
        }
        finally {
            System.out.println("No impact occur...............finally block");
        }
    }
    void func2()
    {
        System.out.println("Second function is working");
    }

    public static void main(String[] args) {
        Number_Format_Exception obj = new Number_Format_Exception();
        obj.func1();
        obj.func2();
    }
}
