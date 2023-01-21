
import java.util.Scanner;

public class longest_palindrome {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        int count=0;
        for(int i=0;i<128;i++){
            if(arr[i]%2==0) count+=arr[i];
            else if(arr[i]>1) count+=arr[i]-1;
        }
        System.out.print("Longest palindromic string is ");
        return (s.length()==count)?count:count+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        System.out.println(new longest_palindrome().longestPalindrome(sc.next()));
    }
}