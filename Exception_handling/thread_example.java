import java.util.Scanner;

public class thread_example extends Thread
{
    public void run()
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            for(int i=1;i<=10;i++)
            {
                System.out.println(i);
                sleep(1000);
                if(i==5)
                    stop();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
        thread_example obj = new thread_example();
        obj.start();
    }
}
