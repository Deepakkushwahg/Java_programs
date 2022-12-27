//use for find maximum sum subarray
package Array;
import java.util.Scanner;
public class kadanes_algo {
    static int maxSumSubArray(int[] arr){
        int maxSum = 0;
        int curSum = 0;
        for(int i=0;i<arr.length;i++){
            curSum+=arr[i];
            if(curSum>maxSum){
                maxSum = curSum;
            }
            if(curSum<0){
                curSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter the element");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum sum of subarray is "+maxSumSubArray(arr));
    }
}
