package problemResult;

import java.sql.Timestamp;
import java.util.function.*;

public abstract class EulerSolution 
{	
	public BothResults getBoth()
	{
		return new BothResults(getTestResult(), getActualResult());
	}
	
	public void printBoth(int problemNumber)
	{
		getBoth().print(problemNumber);
	}
	
	public ProblemResult getTestResult()
	{
		return getResult(() -> getTestValue());
	}

	public ProblemResult getActualResult()
	{
		return getResult(() -> getActualValue());
	}
	
	ProblemResult getResult(Supplier<Integer> getValue)
	{
		Timestamp before = new Timestamp(System.currentTimeMillis());
		int value = getValue.get();
		Timestamp after = new Timestamp(System.currentTimeMillis());
		
		return new ProblemResult(value, after.getTime()-before.getTime());
	}
	
	abstract protected int getTestValue();
	abstract protected int getActualValue();
}
