package problem4;

import problemResult.*;

public class Problem4 extends EulerSolution
{
	Palindrome palindrome;
	Factor factor;
	
	public Problem4() { this(new Palindrome(), new Factor()); }
	
	public Problem4(Palindrome palindrome, Factor factor)
	{
		this.palindrome = palindrome;
		this.factor = factor;
	}
	
	protected int getTestValue()
	{
		return getLargestPalindromeOfTwoProductsUnder(100);
	}
	
	protected int getActualValue()
	{
		return getLargestPalindromeOfTwoProductsUnder(1000);
	}
	
	int getLargestPalindromeOfTwoProductsUnder(int highestFactor)
	{
		for(int candidate = highestFactor*highestFactor-1; candidate>1;candidate--)
		{
			if(!palindrome.isValid(candidate+""))
				continue;
			
			if(factor.hasTwoIntegerFactorsUnder(candidate, highestFactor))
				return candidate;
		}
		
		return -1;
	}
}
