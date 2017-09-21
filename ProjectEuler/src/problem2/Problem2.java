package problem2;

import problemResult.*;

public class Problem2 extends EulerSolution
{
	
	FibonacciSequencer fibonacciSequencer;
	
	public Problem2() { this(new FibonacciSequencer());}
	
	public Problem2(FibonacciSequencer fibonacciSequencer)
	{
		this.fibonacciSequencer  = fibonacciSequencer;
	}
	
	protected int getTestValue()
	{
		return calculateSumOfEvensBelow(100);
	}
	
	protected int getActualValue()
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
