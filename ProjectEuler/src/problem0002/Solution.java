package problem0002;

import problemResult.*;

public class Solution extends EulerSolution
{
	
	FibonacciSequencer fibonacciSequencer;
	
	public Solution() { this(new FibonacciSequencer());}
	
	public Solution(FibonacciSequencer fibonacciSequencer)
	{
		this.fibonacciSequencer  = fibonacciSequencer;
	}
	
	protected long getTestValue()
	{
		return calculateSumOfEvensBelow(100);
	}
	
	protected long getActualValue()
	{
		return calculateSumOfEvensBelow(4000000);
	}
	
	int calculateSumOfEvensBelow(int limit)
	{
		int sum = 0;
		fibonacciSequencer.reset();
		
		while(true)
		{
			int next = fibonacciSequencer.getNextAndAdvance();
			
			if(next > limit)
				return sum;
			
			if(next % 2 == 0)
				sum += next;
		}
	}
	
		
}
