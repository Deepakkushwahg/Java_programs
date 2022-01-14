/* create two thread one using thread class second using runnable interface
to sleep 4 sec and print thread is running creat a excutation class mymain
to excute these thread set the priorty to both thread to minimum.
*/
package Exception_handling;

class thread_1 extends Thread
{
    public void run()
    {
        try
        {
            sleep(4000);
            System.out.println("Thread is working");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class thread_2 implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println("Runnable is working");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class Mymain
{
    public static void main(String[] args) {
        thread_1 obj1 = new thread_1();
        thread_2 obj2 = new thread_2();
        Thread th = new Thread(obj2);
        obj1.start();
        th.start();
        obj1.setPriority(Thread.MAX_PRIORITY);
        th.setPriority(Thread.MIN_PRIORITY);
    }
}
