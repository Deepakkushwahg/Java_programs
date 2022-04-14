package Array;

// shifting of 2D array elements according to given no. that is k in this code
import java.util.Scanner;

public class replacement_in_2D_Array
{
    void display(int[][] matrix,int row,int column,int k,int[] arr)
    {
        int index = (row*column)-k;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                matrix[i][j] = arr[index];
                index = (index+1)%(row*column);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][],column,row,k;
        System.out.print("Enter the no. of row of matrix: ");
        row = sc.nextInt();
        System.out.print("Enter the no. of column of matrix: ");
        column = sc.nextInt();
        matrix = new int[row][column];
        System.out.println("Enter the elements of matrix");
        int arr[],index=0;
        arr = new int[row*column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[index] = matrix[i][j] = sc.nextInt();
                index++;
            }
        }
        System.out.print("Enter howmany times you want to shift elements: ");
        k = sc.nextInt();
        new replacement_in_2D_Array().display(matrix,row,column,k,arr);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
