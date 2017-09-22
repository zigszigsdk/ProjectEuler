package problem6;

import problemResult.*;

public class Problem6 extends EulerSolution
{
	protected int getTestValue()
	{
		return getDifferenceRange(1, 10);
	}
	
	protected int getActualValue()
	{
		return getDifferenceRange(1, 100);
	}
	
	int getDifferenceRange(int from, int to)
	{
		return getSquareOfSum(from, to) - getSumOfSquares(from, to);
	}
	
	int getSumOfSquares(int from, int to)
	{
		int sum = 0;
		for(int at = from; at <= to; at++)
			sum += at*at;
		
		return sum;
	}
	
	int getSquareOfSum(int from, int to)
	{
		int sum = 0;
		for(int at = from; at <= to; at++)
			sum += at;
		
		return sum*sum;
	}
	
}
