package problem0005;

import problemResult.*;
import java.util.ArrayList;

public class Solution extends EulerSolution
{
	protected long getTestValue()
	{
		return getSmallestMultiplieRange(1, 10);
	}
	
	protected long getActualValue()
	{
		return getSmallestMultiplieRange(1, 20);
	}
	
	int getSmallestMultiplieRange(int from, int to)
	{
		ArrayList<Integer> highestDissonantFactors = new ArrayList<Integer>();
		
		for(int candidate = to -1 ; candidate >= from ; candidate--)
		{
			boolean accept = true;
			for(int challenger : highestDissonantFactors)
				if(candidate % challenger == 0)
				{
					accept = false;
					break;
				}
			if(accept)
				highestDissonantFactors.add(candidate);
		}
		
		for(int candidate = to;;candidate += to)
		{
			boolean accept = true;
			for(int challenger : highestDissonantFactors)
				if(candidate % challenger != 0)
				{
					accept = false;
					break;
				}
			
			if(accept)
				return candidate;
		}
	}
}
