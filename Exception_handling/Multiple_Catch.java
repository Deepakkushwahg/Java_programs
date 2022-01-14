import java.util.Scanner;

public class Multiple_Catch
{
    void func1()
    {
        try
        {
            int arr[] = new int[5];
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the values");
            for(int i=0;i<6;i++)
                arr[i]=scan.nextInt();
            for(int i=0;i<6;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        catch(ArrayIndexOutOfBoundsException Ae)
        {
            System.out.println("Array problem: "+Ae);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("division problem: "+ae);
        }
    }
    void func2()
    {
        System.out.println("\nSecond function is working");
    }

    public static void main(String[] args) {
        Multiple_Catch obj = new Multiple_Catch();
        obj.func1();
        obj.func2();
    }
}


// when a try block contains more than one catch block
// Howmany finally block can have of a single try block
// can be implement a catch block without a try block ----No
// Can be implement a finally block without try block ---No
// can be implement a try block without catch and finally block ----NO
// Discri-- Try block must have at least one catch block / finally block
// difference b/w final and finally
//     ans- The basic difference between final, finally and finalize is that the final is an
//          access modifier, finally is the block in Exception Handling and finalize is the method of object class.

//How to make a userdefined Exception (class)