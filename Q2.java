import java.util.Scanner;
public class Q2
{
	Scanner sc = new Scanner(System.in);
	String s;
	Q2()
	{
		System.out.println("Enter your string");
		s = sc.next();
	}
	void output()
	{
		System.out.println("Modifying string");
		StringBuffer st = new StringBuffer("");
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E'|| s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
			{

			}
			else
			{
				st.append(s.charAt(i));
			}
		}
		System.out.println(st);
	}
	public static void main(String args[])
	{
		new Q2().output();
	}
}