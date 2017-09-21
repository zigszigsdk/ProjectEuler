package problemResult;

import java.sql.Timestamp;

public abstract class ResultGenerator 
{	
	public BothResults GetBoth()
	{
		return new BothResults(GetTestResult(), GetActualResult());
	}
	
	public void PrintBoth(int problemNumber)
	{
		GetBoth().Print(problemNumber);
	}
	
	public ProblemResult GetTestResult()
	{
		Timestamp before = new Timestamp(System.currentTimeMillis());
		int value = GetTestValue();
		Timestamp after = new Timestamp(System.currentTimeMillis());
		
		return new ProblemResult(value, after.getTime()-before.getTime());
	}
	
	public ProblemResult GetActualResult()
	{
		Timestamp before = new Timestamp(System.currentTimeMillis());
		int value = GetActualValue();
		Timestamp after = new Timestamp(System.currentTimeMillis());
		
		return new ProblemResult(value, after.getTime()-before.getTime());
	}
	
	abstract protected int GetTestValue();
	abstract protected int GetActualValue();
}
