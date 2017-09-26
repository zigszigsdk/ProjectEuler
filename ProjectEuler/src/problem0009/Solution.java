package problem0009;

import problemResult.*;

public final class Solution extends EulerSolution
{	
	
	protected long getTestValue()
	{
		return findPythagoreanTripletWithSum(3+4+5).product();
	}
	
	protected long getActualValue()
	{
		return findPythagoreanTripletWithSum(1000).product();
	}
	
	PythagoreanTriplet findPythagoreanTripletWithSum(int targetSum)
	{
		for(int candidateC = targetSum-1; candidateC>=3; candidateC--)
		{
			for(int candidateB = candidateC-1; candidateB>=2; candidateB--)
			{
				int candidateA = targetSum - candidateC - candidateB;
				
				if(candidateA <= 0)
					break;
				
				if(Double.compare(Math.pow(candidateA, 2) + Math.pow(candidateB, 2), Math.pow(candidateC, 2)) != 0)
					continue;
				
				return new PythagoreanTriplet(candidateA, candidateB, candidateC);
			}
		}
		
		return new PythagoreanTriplet(-1,-1,-1);
	}
	
	
}

