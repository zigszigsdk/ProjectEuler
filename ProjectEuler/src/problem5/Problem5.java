package problem5;

import problemResult.*;
import java.util.ArrayList;

public class Problem5 extends EulerSolution
{
	protected int getTestValue()
	{
		return getSmallestMultiplieRange(1, 10);
	}
	
	protected int getActualValue()
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
