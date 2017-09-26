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
	
	ProblemResult getResult(Supplier<Long> getValue)
	{
		Timestamp before = new Timestamp(System.currentTimeMillis());
		long value = getValue.get();
		Timestamp after = new Timestamp(System.currentTimeMillis());
		
		return new ProblemResult(value, after.getTime()-before.getTime());
	}
	
	abstract protected long getTestValue();
	abstract protected long getActualValue();
}
