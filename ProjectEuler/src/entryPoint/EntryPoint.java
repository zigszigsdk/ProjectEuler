package entryPoint;

import problemResult.EulerSolution;

public class EntryPoint
{
	public static void main(String[] args)
	{
		for(int problemNumber = 1; problemNumber <= 1000; problemNumber++) 
		{
			try
			{
				String paddedNumber = leftPad(problemNumber, 4);
				Class<EulerSolution> solutionClass =
						(Class<EulerSolution>) Class.forName("problem" + paddedNumber + ".Solution");
				EulerSolution solutionInstance = (EulerSolution) solutionClass.newInstance();
				solutionInstance.printBoth(problemNumber);
			}
			catch(ClassNotFoundException e)
			{
				//allow skipping for problems unsolved
				continue;
			}
			catch(Exception e)
			{
				System.out.print(e.toString());
			}

		}
		System.out.println("------------------------------END------------------------------");
	}
	
	static String leftPad(int number, int length)
	{
		String pad = new String(new char[length]).replace("\0", "0");
		String full = pad + String.valueOf(number);
		return full.substring(full.length()-length, full.length());
	}
}

