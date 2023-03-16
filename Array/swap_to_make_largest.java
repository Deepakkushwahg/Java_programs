package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class swap_to_make_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter no.of swaps");
        int k = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        TreeMap<Integer,Integer> tr = new TreeMap<>(Collections.reverseOrder());

        for(int i=0;i<n;i++){
            tr.put(arr[i],i);
        }

        ArrayList<Integer> ll = new ArrayList<>(tr.keySet()); // 5 4 3 2 1
        for(int i=0;i<n && k>0;i++){
            if(ll.get(i)!=arr[i]){ // 3 4 1 2 5
                int a = ll.get(i); // 5
                int aindx = tr.get(ll.get(i)); // 4
                arr[aindx] = arr[i]; // 5 . . . 3
                arr[i] = a; // 5
                tr.put(a,i); // 5 0
                tr.put(arr[aindx],aindx);
                k--;
            }
        }
        System.out.println("Array after swapping");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}