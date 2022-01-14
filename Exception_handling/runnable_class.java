package Exception_handling;
class ABC
{
    void func()
    {
        System.out.println("fn working");
    }
}
public class runnable_class extends ABC implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }
        }

    }
    public static void main(String[] args) {
        runnable_class obj = new runnable_class();
        Thread th = new Thread(obj);
        th.start();
    }
}
