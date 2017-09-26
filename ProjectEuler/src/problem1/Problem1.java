package problem1;

import java.util.Arrays;
import java.util.ArrayList;

import problemResult.*;

public class Problem1 extends EulerSolution
{
	MultipleFinder finder;
	ArrayList<Integer> multipliers;
	
	public Problem1() { this(new ArrayList<Integer>(Arrays.asList(3, 5)), new MultipleFinder());}
	
	public Problem1(ArrayList<Integer> multipliers, MultipleFinder finder)
	{
		this.multipliers = multipliers;
		this.finder = finder;
	}
	
	protected long getTestValue()
	{
		return calculate(multipliers, 10);
	}
	
	protected long getActualValue()
	{
		return calculate(multipliers, 1000);
	}
	
	int calculate(ArrayList<Integer> multipliers, int upTo)
	{
		return sum(finder.getUnder(multipliers, upTo));
	}
	
	int sum(ArrayList<Integer> input)
	{
		int sum = 0;
		for(int value : input)
		    sum += value;

		return sum;
	}
}
