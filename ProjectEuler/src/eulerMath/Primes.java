package eulerMath;

import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigInteger;

public class Primes
{
	final static int GUESS_CERTAINTY = 5;

	final static BigInteger ZERO = BigInteger.ZERO;
	final static BigInteger ONE = BigInteger.ONE;
	final static BigInteger TWO = new BigInteger("2");
	final static BigInteger THREE = new BigInteger("3");
	
	BigIntegerSquareRoot sqrt;
	
	public Primes(BigIntegerSquareRoot sqrt)
	{
		this.sqrt = sqrt;
	}
	
	public Primes() { this(new BigIntegerSquareRoot()); }
	
	public ArrayList<BigInteger> getInRange(BigInteger from, BigInteger to)
	{
		ArrayList<BigInteger> results = new ArrayList<BigInteger>();
		
		if(from.compareTo(TWO) <= 0)
		{
			results.add(TWO);
			from = THREE;
		}
		
		for(BigInteger candidate = from.mod(TWO).equals(ZERO) ? from.add(ONE) : from
		;	candidate.compareTo(to) <= 0
		;	candidate = candidate.add(TWO)
		)
			if(isPrime(candidate)) 
				results.add(candidate);

		return results;
	}
	
	public boolean isPrime(BigInteger candidate)
	{
		if(!candidate.isProbablePrime(GUESS_CERTAINTY))
			return false;
		
		if(candidate.equals(TWO))
			return true;
		
		if(candidate.mod(TWO).equals(ZERO))	
			return false;
		
		BigInteger candidateSqrt = sqrt.floor(candidate);
		
		for(BigInteger challenger = THREE
		;	challenger.compareTo(candidateSqrt) < 0
		;	challenger = challenger.add(TWO)
		)
			if(candidate.mod(challenger).equals(ZERO))
				return false;

	    return true;
	}
	
	public boolean isPrime(int candidate)
	{
		if(candidate == 1)
			return false;
		
		if(candidate == 2)
			return true;
		
		if(candidate % 2 == 0)	
			return false;

		int candidateSqrt = (int)Math.sqrt(candidate);

		for(int challenger = 3
		;	challenger <= candidateSqrt
		;	challenger += 2
		)
			if (candidate % challenger == 0)
				return false;

		return true;
	}
	
	public BigInteger getNthAfter(BigInteger nth, BigInteger after) 
	{
		BigInteger currentValue = nextPrime(after);
		BigInteger currentAt = ONE;
		
		while(true)
		{
			if(currentAt.compareTo(nth) >= 0)
				return currentValue;
			
			currentValue = nextPrime(currentValue);
			currentAt = currentAt.add(ONE);
		}
	}
	
	public int getNthAfter(int nth, int after)
	{
		int currentValue = nextPrime(after);
		int currentAt = 1;
		
		while(true)
		{
			if(currentAt >= nth)
				return currentValue;
			
			currentValue = nextPrime(currentValue);
			currentAt++;
		}
	}
	
	public BigInteger nextPrime(BigInteger after)
	{
		BigInteger candidate = after.nextProbablePrime();
		
		while(true)
		{
			if(isPrime(candidate))
				return candidate;
			
			candidate = candidate.nextProbablePrime();
		}
	}
	
	public int nextPrime(int after)
	{
		int candidate = after+1;
		
		while(true)
		{
			if(isPrime(candidate))
				return candidate;

			candidate++;
		}
	}
	
	public ArrayList<Integer> getAllUpTo(int to)
	{
		boolean[] primeSieve = new boolean[to];
		
		primeSieve[2] = true;
		for(int potentialPrime = 3; potentialPrime < to; potentialPrime +=2)
			primeSieve[potentialPrime] = true;
		
		ArrayList<Integer> primesThusFar = new ArrayList<Integer>();
		primesThusFar.add(2);
		
		for(int candidate = 3; candidate < to; candidate += 2)
		{
			if(!primeSieve[candidate])
				continue;
			
			boolean accept = true;
			int candidateSqrt= (int)Math.sqrt(candidate);
			
			for(int challenger : primesThusFar)
			{	
				if(challenger > candidateSqrt)
					break;
			
				if(candidate % challenger == 0) 
				{
					accept = false;
					break;
				}
			}
			if(!accept)
				continue;

			primesThusFar.add(candidate);
			
			for(int extrapolationFactor : primesThusFar) 
			{
				int extrapolationCandidate = extrapolationFactor*candidate;
				if(extrapolationCandidate >= to)
					break;
				
				primeSieve[extrapolationCandidate] = false;
			}
		}
		
		return primesThusFar;
	}
}
