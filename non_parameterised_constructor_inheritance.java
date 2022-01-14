class Deepak
{
	Deepak()
	{
		System.out.println("Deepak .... non para constructor..... base");
	}
}
class non_parameterised extends Deepak
{
	non_parameterised()
	{
		System.out.println("GLA ..... non para constructor.... derived");
	}
	public static void main(String[] args) {
		non_parameterised con = new non_parameterised();
	}
}