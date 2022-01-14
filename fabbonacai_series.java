import java.util.Scanner;
class inputfabbo
{
	int a,b,c,n;
	inputfabbo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit: ");
		n=sc.nextInt();
	}
}
class fabbonacai_series extends inputfabbo
{
	void display()
	{
		a=0;
		b=1;
		System.out.println("Fabbonacai series is");
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
		fabbonacai_series obj = new fabbonacai_series();
		obj.display();
	}
}