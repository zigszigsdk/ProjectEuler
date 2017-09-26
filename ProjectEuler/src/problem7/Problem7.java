package problem7;

import problemResult.*;
import eulerMath.Primes;
import java.math.BigInteger;

public class Problem7 extends EulerSolution
{
	static final BigInteger ZERO = BigInteger.ZERO;
	
	final Primes primes;
	
	public Problem7() { this(new Primes()); }
	
	public Problem7(Primes primes)
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
