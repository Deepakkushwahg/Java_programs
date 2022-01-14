class sunMicrosystem
{
	void JAVA()
	{
		System.out.println("java program....");
	}
}
class Google extends sunMicrosystem
{
	void android()
	{
		System.out.println("Android app develop....");
	}
}
class Oracle extends Google
{
	void DBMS()
	{
		System.out.println("sql....");
	}
	public static void main(String[] args)
	{
		Oracle obj = new Oracle();
		
		obj.DBMS();
		obj.JAVA();
		obj.android();
	}
}
// Function overloading verus function overrighting.
// java does not support multiple inheritance therefore java provide a concepts of interface of an 