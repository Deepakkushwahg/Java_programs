import java.util.Scanner;

public class BanBan_of_codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int firstB=1,lastA=3*n-1;
            System.out.println((n+1)/2);
            while(lastA>firstB){
                System.out.println(firstB+" "+lastA);
                firstB+=3;
                lastA-=3;
            }
        }
    }
}
