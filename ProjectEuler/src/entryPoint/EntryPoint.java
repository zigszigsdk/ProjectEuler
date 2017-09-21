package entryPoint;

import problemResult.ResultGenerator;

import problem1.Problem1;
import problem2.Problem2;

public class EntryPoint
{
	public static void main(String[] args)
	{
		ResultGenerator[] resultGenerators = new ResultGenerator[]
				{ new Problem1()
				, new Problem2()
				};
		
		for(int index = 0; index < resultGenerators.length; index++)
			resultGenerators[index].PrintBoth(index+1);
	}
}
