package problem0003;

import problemResult.*;
import java.math.BigInteger;

import eulerMath.BigIntegerSquareRoot;
import eulerMath.Primes;

public class Solution extends EulerSolution
{
	final static BigInteger ZERO = BigInteger.ZERO;
	final static BigInteger ONE = BigInteger.ONE;
	final static BigInteger TWO = new BigInteger("2");
	final static BigInteger THREE = new BigInteger("3");
	
	Primes primes;
	BigIntegerSquareRoot sqrt;
	
	public Solution() { this(new Primes(), new BigIntegerSquareRoot());}
	
	public Solution(Primes primes, BigIntegerSquareRoot sqrt)
	{
		this.primes  = primes;
		this.sqrt = sqrt;
	}
	
	protected long getTestValue()
	{
		return findLargestPrimeFactorOf(new BigInteger("13195"));
	}
	
	protected long getActualValue()
	{
		return findLargestPrimeFactorOf(new BigInteger("600851475143"));
	}
	
	int findLargestPrimeFactorOf(BigInteger target)
	{
		BigInteger targetSqrt = sqrt.floor(target);
		
		for(BigInteger candidate = targetSqrt.subtract(ONE).nextProbablePrime()
		;	candidate.compareTo(THREE) >= 0
		;	candidate = candidate.subtract(TWO)
		) {
			if(!target.mod(candidate).equals(ZERO))
				continue;
			
			if(primes.isPrime(candidate) )
				return candidate.intValue();
		}
		
		if(target.mod(TWO).equals(ZERO))
			return 2;
		
		return -1;
	}
}
