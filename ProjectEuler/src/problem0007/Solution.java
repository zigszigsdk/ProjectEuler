package problem0007;

import problemResult.*;
import eulerMath.Primes;
import java.math.BigInteger;

public class Solution extends EulerSolution
{
	static final BigInteger ZERO = BigInteger.ZERO;
	
	final Primes primes;
	
	public Solution() { this(new Primes()); }
	
	public Solution(Primes primes)
	{
		this.primes = primes;
	}
	
	protected long getTestValue()
	{
		return primes.getNthAfter(6, 0);
	}
	
	protected long getActualValue()
	{
		return primes.getNthAfter(10001, 0);
	}
}
