import java.util.Scanner;

public class printing_using_thread extends Thread
{
    public void run()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name");
            String name = sc.nextLine();
            System.out.println("\n----------------------------o/p----------------------------\n");
            for(int i=0;i<name.length();i++)
            {
                System.out.print(name.charAt(i));
                sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        printing_using_thread obj = new printing_using_thread();
        obj.start();
    }
}
