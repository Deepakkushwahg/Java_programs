import java.util.Scanner;
class inputfibo
{
	int a,b,c,n;
	inputfibo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit: ");
		n=sc.nextInt();
	}
}
class fibonacci_series extends inputfibo
{
	void display()
	{
		a=0;
		b=1;
		System.out.println("fibonacci series is");
		System.out.print(a);
		while(n-1>0)
		{
			c=a;
			a=a+b;
			b=c;
			System.out.print(" "+a);
			n--;
		}
	}
	public static void main(String arg[])
	{
		fibonacci_series obj = new fibonacci_series();
		obj.display();
	}
}