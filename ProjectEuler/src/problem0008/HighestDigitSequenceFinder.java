package problem0008;

public final class HighestDigitSequenceFinder
{
	public long largestProductOfSequence(String digitSequence, int targetLength)
	{
		long bestCandidate = 0;
		
		for(int index = 0; index < digitSequence.length() - targetLength; index++)
		{
			long challengerProduct = product(digitSequence.substring(index, index+targetLength));
			if(challengerProduct > bestCandidate)
				bestCandidate = challengerProduct;
		}
			
		return bestCandidate;
		
	}
	
	long product(String input)
	{
		long product = 1;
		
		for(int index = 0; index < input.length(); index++)
			product *= Character.getNumericValue(input.charAt(index));

		return product;
	}
}
