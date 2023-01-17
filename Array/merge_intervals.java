package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class merge_intervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a, b) -> a[0]-b[0]);
        List<int[]> list = new ArrayList<int[]>();
        for(int i=0;i<intervals.length;i++){
            list.add(intervals[i]);
        }
        int i=0,f=0;
        while(i<list.size()-1){
            if(list.get(i)[1]>=list.get(i+1)[0] && list.get(i)[1]<list.get(i+1)[1]){
                list.get(i)[1] = list.get(i+1)[1];
                list.remove(i+1);
                f=1;
            }
            else if(list.get(i)[1]>=list.get(i+1)[0]){
                list.remove(i+1);
                f=1;
            }
            if(f==0) i++;
            f=0;
        }
        int[][] arr = new int[list.size()][2];
        for(i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int row = sc.nextInt();
        System.out.println("Enter the element with 2 columns");
        int[][] arr = new int[row][2];
        for(int i=0;i<row;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        arr = new merge_intervals().merge(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}



