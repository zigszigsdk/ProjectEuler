package entryPoint;

import problemResult.EulerSolution;

public class EntryPoint
{
	public static void main(String[] args)
	{
		EulerSolution[] resultGenerators = new EulerSolution[]
				{ new problem1.Problem1()
				, new problem2.Problem2()
				, new problem3.Problem3()
				, new problem4.Problem4()
				, new problem5.Problem5()
				};
		
		for(int index = 0; index < resultGenerators.length; index++)
			resultGenerators[index].printBoth(index+1);
		
		System.out.println("------------------------------END------------------------------");
	}
}
