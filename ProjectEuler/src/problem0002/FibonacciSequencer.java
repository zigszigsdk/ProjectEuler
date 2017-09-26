package problem0002;

public class FibonacciSequencer
{
	int currentHigh = 0;
	int currentLow = 0;
	
	public int getNextAndAdvance()
	{
		if(currentHigh == 0)	
		{	
			currentHigh = 1;
			return 1;
		}

		if(currentLow == 0)
		{
			currentHigh = 2;
			currentLow = 1;
			return 2;
		}
		int prevHigh = currentHigh;
		currentHigh = currentHigh+currentLow;
		currentLow = prevHigh;
		
		return currentHigh;
	}
	
	public void reset() 
	{
		currentHigh = 0;
		currentLow = 0;
	}
}