package Array;

        import java.util.Scanner;

public class additionOfTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column of matrix A and B respectively");
        int row = sc.nextInt();
        int column = sc.nextInt();
        System.out.println("Enter the Elements for Matrix A");
        int[][] A = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Elements for Matrix B");
        int[][] B = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                B[i][j] = sc.nextInt();
                A[i][j] = A[i][j]+B[i][j];
            }
        }
        System.out.println("Addition of two matrix is");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
