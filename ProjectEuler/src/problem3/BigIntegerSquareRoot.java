package problem3;

import java.math.BigInteger;

public class BigIntegerSquareRoot
{
	static final BigInteger ONE = BigInteger.ONE;
	static final BigInteger TWO = new BigInteger("2");
	
	public BigInteger floor(BigInteger input)
	{
	    BigInteger result;
	    
	    for(result = input.divide(TWO)
	    ;	result.compareTo(input.divide(result)) > 0
	    ;	result = input.divide(result).add(result).divide(TWO));
	    
	    return result;
	}
	
	public BigInteger ceil(BigInteger input)
	{
	    BigInteger floored = floor(input);
	    
	    if (input.compareTo(floored.multiply(floored)) == 0) {
	        return floored;
	    } else {
	        return floored.add(ONE);
	    }
	}
}
