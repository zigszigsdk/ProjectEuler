package problem9;

public final class PythagoreanTriplet
{
	public final int a;
	public final int b;
	public final int c;
	
	public PythagoreanTriplet(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int sum()
	{
		return a + b + c;
	}
	
	public int product() 
	{
		return a * b * c;
	}
}