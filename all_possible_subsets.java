import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class all_possible_subsets {
    List<List<Integer>> ans = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter the element");
        int[] nums = new int[size];
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("All possible subsets are");
        System.out.println(new all_possible_subsets().subsets(nums));
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> track = new ArrayList<>();
        backtrace(0,nums,track);
        return ans;
    }

    public void backtrace(int start,int[] nums,ArrayList<Integer> track){
        for(int i=start;i<nums.length;i++){
            ArrayList<Integer> temp = new ArrayList<>(track);
            temp.add(nums[i]);
            backtrace(i+1,nums,temp);
        }
        ans.add(track);
    }
}
