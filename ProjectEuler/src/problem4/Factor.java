package problem4;

public class Factor
{
	public boolean hasTwoIntegerFactorsUnder(int candidate, int under)
	{
		for(int largeFactor = Math.min(under, candidate/2); largeFactor > 0; largeFactor--)
		{
			if(candidate % largeFactor != 0)
				continue;
			
			if(candidate / largeFactor > largeFactor)
				return false;
			
			return true;
		}
		
		return false;
	}
}
