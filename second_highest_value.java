import java.util.Scanner;
public class second_highest_value 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int x;
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    x=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=x;
                }
            }
        }
        System.out.println("Second maximum value is "+arr[arr.length-2]);
    }
    
}
