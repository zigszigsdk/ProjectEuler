package problemResult;

public class BothResults 
{
	public ProblemResult test;
	public ProblemResult actual;
	
	public BothResults(ProblemResult test, ProblemResult actual)
	{
		this.test = test;
		this.actual = actual;
	}
	
	public void print(int problemNumber)
	{	
		test.print(problemNumber, ResultType.TEST);
		actual.print(problemNumber, ResultType.ACTUAL);
	}
}
