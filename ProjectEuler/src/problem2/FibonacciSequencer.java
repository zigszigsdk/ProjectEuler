package problem2;

public class FibonacciSequencer
{
	int currentHigh = 0;
	int currentLow = 0;
	
	public int GetNextAndAdvance()
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
	
	public void Reset() 
	{
		currentHigh = 0;
		currentLow = 0;
	}
}