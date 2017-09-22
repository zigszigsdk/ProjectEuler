package problem3;

import java.math.BigInteger;

public class BigIntegerSquareRoot
{
	static final BigInteger ONE = BigInteger.ONE;
	static final BigInteger TWO = new BigInteger("2");
	
	public BigInteger approximateFloorFromAbove(BigInteger input, int iterationsRemaining)
	{
		BigInteger result;
	    
	    for(result = input.divide(TWO) 
	    ;	result.compareTo(input.divide(result)) > 0 && iterationsRemaining >= 0
	    ;	result = input.divide(result).add(result).divide(TWO)
	    )
	    	iterationsRemaining--;

	    return result;
	}
	
	public BigInteger floor(BigInteger input)
	{
	    return approximateFloorFromAbove(input, Integer.MAX_VALUE);
	}
	
	public BigInteger ceil(BigInteger input)
	{
	    BigInteger floored = approximateFloorFromAbove(input, Integer.MAX_VALUE);
	    
	    if (input.compareTo(floored.multiply(floored)) == 0) {
	        return floored;
	    } else {
	        return floored.add(ONE);
	    }
	}
}
