class para
{
	para()
	{
		System.out.println("Deepak .... non para constructor..... base");
	}
	para(int a)
	{
		System.out.println("Deepak .... para constructor..... base");
	}
}
class parameterised extends para
{
	parameterised()
	{
		System.out.println("GLA .....non para constructor.... derived");
	}
	parameterised(int a)
	{
		System.out.println("GLA .... para constructor..... derived");
	}
	public static void main(String[] args) 
    {
		parameterised con = new parameterised(5);
	}
}