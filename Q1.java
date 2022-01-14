import java.util.Scanner;
public class Q1
{
	Scanner sc = new Scanner(System.in);
	int n;
	int arr[];
	Q1()
	{
		System.out.print("Enter the size of array: ");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter the Elements of array");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
	}
	void output()
	{
		System.out.println("Numbers which are divisible by 3 or 5");
		for(int i=0;i<n;i++)
		{
			if(arr[i]%3==0 || arr[i]%5==0)
			{
				if(arr[i]%3==0 && arr[i]%5==0);
				else
					System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String args[])
	{
		new Q1().output();
	}
}