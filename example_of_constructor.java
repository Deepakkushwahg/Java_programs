// Example_of_constructor

public class example_of_constructor
{
	example_of_constructor()
	{
		System.out.println("Welcome in GLA..");
	}
	void Btech()
	{
		System.out.println("Btech program...");

	}
	void BBA()
	{
		System.out.println("BBA program....");
	}
	void BCA()
	{
		System.out.println("BCA program....");
	}
	public static void main(String[] args)
	{
		example_of_constructor con = new example_of_constructor();
		con.Btech();
		con.BBA();
		con.BCA();
		con.Btech();
		con.Btech();
		con.BBA();
	}
}

