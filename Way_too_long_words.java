import java.util.Scanner;

class takeInput
{
    Scanner scan = new Scanner(System.in);
    int n;
    takeInput()
    {
        System.out.println("Enter no. of testcases");
        n = scan.nextInt();
    }
}
public class Way_too_long_words extends takeInput
{
    void display()
    {
        for(int i=0;i<n;i++)
        {
            String st = scan.next();
            if(st.length()>10)
            {
                System.out.print(st.charAt(0));
                System.out.print(st.length()-2);
                System.out.println(st.charAt(st.length()-1));
            }
            else
                System.out.println(st);
        }
    }
    public static void main(String[] args) {
        Way_too_long_words obj = new Way_too_long_words();
        obj.display();
    }
}
