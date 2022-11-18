package Array;

import java.util.Scanner;

public class two_groups_of_codeForces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int size = sc.nextInt();
            int[] arr = new int[size];
            long sum = 0;
            for(int j=0;j<size;j++){
                arr[j] = sc.nextInt();
                sum+=arr[j];
            }
            System.out.println(Math.abs(sum));

        }
    }
}
