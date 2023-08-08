package Accenture_previous_year_questions;

import java.util.Scanner;

public class rat_count_house {
    private static int count_house(int[] arr, int n, int total){
        if(n==0) return -1;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>=total) return i+1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rats");
        int r = sc.nextInt();
        System.out.println("Enter amount of food required for each rat");
        int unit = sc.nextInt();
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elememts");
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Rat count houses is/are "+ count_house(arr, n, r*unit));
    }
}

