import java.util.Scanner;

public class swap_game_codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int size = sc.nextInt();
            int[] arr = new int[size];
            int min = Integer.MAX_VALUE;
            for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
                if(i!=0)
                    min = Math.min(min,arr[i]);
            }
            if(min >= arr[0]){
                System.out.println("Bob");
            }
            else System.out.println("Alice");
        }
    }
}
