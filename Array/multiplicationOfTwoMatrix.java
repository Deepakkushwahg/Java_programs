package Array;

import java.util.Scanner;

public class multiplicationOfTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column of matrix A respectively");
        int rowA = sc.nextInt();
        int columnA = sc.nextInt();
        System.out.println("Enter the Elements");
        int[][] A = new int[rowA][columnA];
        for(int i=0;i<rowA;i++){
            for(int j=0;j<columnA;j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the row and column of matrix B respectively");
        int rowB = sc.nextInt();
        int columnB = sc.nextInt();
        System.out.println("Enter the Elements");
        int[][] B = new int[rowB][columnB];
        for(int i=0;i<rowB;i++){
            for(int j=0;j<columnB;j++){
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Multiplication of two matrix is");
        int s=0;
        int[][] C = new int[rowA][columnB];
        for(int i=0;i<rowA;i++){
            for(int j=0;j<columnB;j++){
                for(int l=0,k=0;l<columnA && k<rowB;l++,k++)
                    s=s+A[i][l]*B[k][j];
                C[i][j]=s;
                System.out.print(C[i][j]+" ");
                s=0;
            }
            System.out.println();
        }
    }
}
