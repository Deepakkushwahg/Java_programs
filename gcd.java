import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n1 = sc.nextInt();
        System.out.println("Enter the number");
        int n2 = sc.nextInt();
        System.out.println("GCD of "+n1+" and "+n2+" is "+gcd(n1,n2));
    }
    private static int gcd(int n1,int n2){
        if(n1==n2) return n1;
        if(n1>n2) return gcd(n1-n2,n2);
        else return gcd(n1,n2-n1);
    }
}
