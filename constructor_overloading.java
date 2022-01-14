class GLA
{
	GLA()
	{
		System.out.println("Non parameter constructor.....");
	}
	GLA(int a)
	{
		System.out.println("Parameter constructor...");
	}
	public static void main(String[] args) 
 {
		GLA con1 = new GLA();
		GLA con2 = new GLA(5);
	}
}