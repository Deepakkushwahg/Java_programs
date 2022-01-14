package Array;

import java.util.Scanner;
public class check_positive_negative_element_of_array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int cp=0,cn=0;
        for(int i : arr)
        {
            if(i>0)
                cp++;
            else if(i<0)
                cn++;
        }
        System.out.println("No. of positive values is "+cp);
        System.out.println("No. of negative values is "+cn);
        
    }
    
}
