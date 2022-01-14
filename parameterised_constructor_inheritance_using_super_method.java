class param
{
	param()
	{
		System.out.println("param .... non para constructor..... base");
	}
	param(int a)
	{
		System.out.println("param .... para constructor..... base");
	}
}
class using_super_method extends param
{
	using_super_method()
	{
		System.out.println("using super method .....non para constructor.... derived");
	}
	using_super_method(int z)
	{
		super(z);
		System.out.println("using super method .... para constructor..... derived");
	}
	public static void main(String[] args) {
		using_super_method con = new using_super_method(5);
	}
}