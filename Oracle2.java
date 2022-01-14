// Function Overriding
// cnanot override the final method from SunMicrosystem 
class SunMicrosystem
{
	void JAVA()
	{
		System.out.println("java program....");
	}
	//overridden
	final void clang()
	{
		System.out.println("C language by sunMicrosystem.....base");
	}
}
class Oracle2 extends SunMicrosystem
{
	//override
	// void clang()
	// {
	// 	System.out.println("C language by Oracle2....derived");
	// }
	void DBMS()
	{
		System.out.println("sql....");
	}
	public static void main(String[] args)
	{
		Oracle2 obj = new Oracle2();
		obj.JAVA();
		obj.clang();
	}
}