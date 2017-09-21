package problem2;

import problemResult.*;

public class Problem2 extends ResultGenerator
{
	
	FibonacciSequencer fibonacciSequencer;
	
	public Problem2() { this(new FibonacciSequencer());}
	
	public Problem2(FibonacciSequencer fibonacciSequencer)
	{
		this.fibonacciSequencer  = fibonacciSequencer;
	}
	
	protected int GetTestValue()
	{
		return CalculateSumOfEvensBelow(100);
	}
	
	protected int GetActualValue()
	{
		return CalculateSumOfEvensBelow(4000000);
	}
	
	int CalculateSumOfEvensBelow(int limit)
	{
		int sum = 0;
		fibonacciSequencer.Reset();
		
		while(true)
		{
			int next = fibonacciSequencer.GetNextAndAdvance();
			
			if(next > limit)
				return sum;
			
			if(next % 2 == 0)
				sum += next;
		}
	}
	
		
}
