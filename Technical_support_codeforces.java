import java.util.Scanner;

public class Technical_support_codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int size = sc.nextInt();
            String st = sc.next();
            int q=0;
            for(int i=0;i<size;i++){
                if(st.charAt(i)=='Q')
                    q++;
                else q=Math.max(0,q-1);
            }
            if(q==0) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
