import java.util.Scanner;

public class factorial_with_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.print("Factorial of the number is "+fact(n));
    }
    private static int fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
}
