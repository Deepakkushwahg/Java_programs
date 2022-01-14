// breaking overiding using final keyword
class SunMicro
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
class Oracle3 extends SunMicro
{
	//override
//	 void clang()
// 	{
//		System.out.println("C language by Oracle2....derived");
//	}
	void DBMS()
	{
		System.out.println("sql....");
	}
	public static void main(String[] args)
	{
		Oracle3 obj = new Oracle3();
		obj.JAVA();
		obj.clang();
		obj.DBMS();
	}
}