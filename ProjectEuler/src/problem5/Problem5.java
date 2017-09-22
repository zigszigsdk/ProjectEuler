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
		for(int candidate = to;;candidate += 1)
		{
			boolean accept = true;
			for(int challenger = from; challenger < to; challenger++)
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
