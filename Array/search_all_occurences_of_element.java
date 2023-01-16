package Array;

import java.util.Scanner;

public class search_all_occurences_of_element
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value which you want to search in array");
        int ele = sc.nextInt();
        int count = 0;
        System.out.print(ele+" is found at indexes ");
        for(int i=0;i<size;i++){
            if(arr[i] == ele){
                System.out.print(i+",");
                count++;
            }
        }
        if(count==0) System.out.println("\rElement not found");
        else System.out.println("\b\nNo. of "+ele+"'s in array are "+count);
    }
}