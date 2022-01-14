package Exception_handling;
class thread1 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println("Deepak.............."+i);
                sleep(500);
            }
        }
        catch(Exception e)
        {

        }
    }
}
class thread2 extends Thread
{
    public void run()
    {
        try
        {
            for(int j=60;j<=100;j=j+2)
            {
                System.out.println("Harsh..........."+j);
                sleep(1000);
            }
        }
        catch(Exception e)
        {

        }
    }
}
public class multi_threading
{
    public static void main(String[] args) {
        thread1 th1 = new thread1();
        thread2 th2 = new thread2();
        th1.start();
        th2.start();

    }
}
