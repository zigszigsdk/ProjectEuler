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
	
	public void Print(int problemNumber)
	{	
		test.Print(problemNumber, ResultType.TEST);
		actual.Print(problemNumber, ResultType.ACTUAL);
	}
}
