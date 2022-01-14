import java.util.Scanner;

public class wrapper_class
{
    void func()
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Integer x = new Integer(i);  //Boxing  or wrapper class
        int j = x.intValue();  // unboxing
        System.out.println(j);
    }
    public static void main(String[] args) {
        new wrapper_class().func();

    }
}
