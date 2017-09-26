package problem0010;

import java.util.ArrayList;

import eulerMath.Primes;
import problemResult.*;

public final class Solution extends EulerSolution
{
	final Primes primes;
	
	public Solution() { this(new Primes()); }
	
	public Solution(Primes primes)
	{
		this.primes = primes;
	}
	
	protected long getTestValue()
	{
		return sum(primes.getAllUpTo(10));//sumPrimesFromTo(0, 10);
	}
	
	protected long getActualValue()
	{
		return sum(primes.getAllUpTo(2000000));//sumPrimesFromTo(0, 2000000);
	}
	
	long sum(ArrayList<Integer> toSum)
	{
		long result = 0;
		for(int value : toSum)
			result += value;
		
		return result;
	}
	
	long sumPrimesFromTo(int from, int to)
	{
		int at = from;
		long sum = 0;
		
		while(true)
		{
			int next = primes.nextPrime(at);
			
			if(next >= to)
				break;
			
			at = next;
			sum += next;
		}
		
		return sum;
	}
}
