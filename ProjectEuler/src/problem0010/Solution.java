package problem0010;

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
		return sumPrimesFromTo(0, 10);
	}
	
	protected long getActualValue()
	{
		return sumPrimesFromTo(0, 2000000);
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
