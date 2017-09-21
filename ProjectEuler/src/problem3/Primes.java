package problem3;

import java.util.ArrayList;
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

	    BigInteger candidateSqrt = sqrt.ceil(candidate);
	    
	    for(BigInteger challenger = THREE
	    ;	challenger.compareTo(candidateSqrt) < 0
	    ;	challenger = challenger.add(TWO)
	    )
	        if (candidate.mod(challenger).equals(ZERO))
	            return false;

	    return true;
	}
}
