package problemResult;

public class ProblemResult
{
	public final String value;
	public final long msTaken;
	
	public ProblemResult(String value, long msTaken)
	{
		this.value = value;
		this.msTaken = msTaken;
	}
	
	public ProblemResult(int value, long msTaken) { this(Integer.toString(value), msTaken); }
	
	public ProblemResult(double value, long msTaken) { this(Double.toString(value), msTaken); }
	
	public void Print(int problemNumber, ResultType type)
	{
		String timeText;
		if(msTaken == 0)
			timeText = " (took <1 milisecond)";
		else if(msTaken == 1)
			timeText = " (took " + msTaken + " milisecond)";
		else
			timeText = " (took " + msTaken + " miliseconds)";

		System.out.println(type.toString() + " result for problem " + problemNumber + " is " + value +
				timeText);
	}
}