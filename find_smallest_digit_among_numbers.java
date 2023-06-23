import java.util.Scanner;

public class find_smallest_digit_among_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all number from 1000 to 9999");
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        System.out.println("Enter third number");
        int n3 = sc.nextInt();
        int ans = 0, i=3;
        while(n1>0){
            int d = (int)Math.pow(10,i);
            i--;
            int x = Math.min(Math.min(n1/d, n2/d), n3/d);
            ans = ans*10+x;
            n1 %= d;
            n2 %= d;
            n3 %= d;
        }
        System.out.println("smallest digits among three numbers is "+ans);
    }
}