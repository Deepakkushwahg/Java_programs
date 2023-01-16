package Array;

import java.util.Scanner;

public class sort_table_according_to_marks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int students = sc.nextInt();
        int[][] table = new int[students][2];
        System.out.println("Enter the student records");
        for(int i=0;i<students;i++){
            table[i][0] = sc.nextInt();
            table[i][1] = sc.nextInt();
        }
        for(int i=1;i<students;i++){
            for(int j=0;j<students;j++){
                if(table[i][1]>table[j][1]){
                    int[] t = table[i];
                    table[i] = table[j];
                    table[j] = t;
                }
            }
        }
        System.out.println("Table after sorting");
        for(int i=0;i<students;i++){
            System.out.println(table[i][0]+" "+table[i][1]);
        }
    }
}