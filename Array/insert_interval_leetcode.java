package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class insert_interval_leetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of intervals");
        int size = sc.nextInt();
        int[][] intervals = new int[size][2];
        System.out.println("Enter intervals");
        for(int i=0;i<size;i++){
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        System.out.println("Enter the interval which you want to insert");
        int[] newInterval = new int[2];
        newInterval[0] = sc.nextInt();
        newInterval[1] = sc.nextInt();
        System.out.println("After insertion intervals are");
        intervals = new insert_interval_leetcode().insert(intervals,newInterval,size);
        System.out.print("[");
        for(int i=0;i< intervals.length;i++){
            System.out.print("["+intervals[i][0]+","+intervals[i][1]+"],");
        }
        System.out.println("\b]");
    }
    public int[][] insert(int[][] intervals, int[] newInterval, int size) {
        if(size==0) return new int[][]{newInterval};
        List<int[]> list = new ArrayList<int[]>();
        for(int i=0;i<size;i++){
            if(intervals[i][1]<newInterval[0])
                list.add(intervals[i]);
            else if(intervals[i][0]>newInterval[1]){
                list.add(newInterval);
                newInterval=intervals[i];
            }else{
                newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
                newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            }
        }
        list.add(newInterval);

        // return list.toArray(new int[list.size()][]);

        int[][] arr = new int[list.size()][2];
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
