package problem0004;

import problemResult.*;

public class Solution extends EulerSolution
{
	Palindrome palindrome;
	Factor factor;
	
	public Solution() { this(new Palindrome(), new Factor()); }
	
	public Solution(Palindrome palindrome, Factor factor)
	{
		this.palindrome = palindrome;
		this.factor = factor;
	}
	
	protected long getTestValue()
	{
		return getLargestPalindromeOfTwoProductsUnder(100);
	}
	
	protected long getActualValue()
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
