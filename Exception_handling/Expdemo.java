import java.util.Scanner;

public class Expdemo {
    void fun1(){
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter I value ..");
        int a = sc.nextInt();
        System.out.println("Enter II value ..");
        int b = sc.nextInt();
        int res = a/b;          // exception
        System.out.println("Division : "+ res);
    }
    catch(ArithmeticException obj)
    {
        //System.out.println("Problem occur....");
        //System.out.println(obj);
        System.out.println(obj.getMessage());
    }}
    void fun2(){
        System.out.println("II fuction is working..");
    }
    public static void main(String[] args) {
        Expdemo obj = new Expdemo();
        obj.fun1();
        obj.fun2();
    }
}
