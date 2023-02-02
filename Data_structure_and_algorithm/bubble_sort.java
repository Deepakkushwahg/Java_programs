package Data_structure_and_algorithm;

import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println("Enter the Elements");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println("Element after sorting");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
