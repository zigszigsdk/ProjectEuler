package problem1;

import java.util.Arrays;
import java.util.ArrayList;

import problemResult.*;

public class Problem1 extends ResultGenerator
{
	MultipleFinder finder;
	ArrayList<Integer> multipliers;
	
	public Problem1() { this(new ArrayList<Integer>(Arrays.asList(3, 5)), new MultipleFinder());}
	
	public Problem1(ArrayList<Integer> multipliers, MultipleFinder finder)
	{
		this.multipliers = multipliers;
		this.finder = finder;
	}
	
	protected int GetTestValue()
	{
		return Calculate(multipliers, 10);
	}
	
	protected int GetActualValue()
	{
		return Calculate(multipliers, 1000);
	}
	
	int Calculate(ArrayList<Integer> multipliers, int upTo)
	{
		return Sum(finder.getUnder(multipliers, upTo));
	}
	
	int Sum(ArrayList<Integer> input)
	{
		int sum = 0;
		for(int value : input)
		    sum += value;

		return sum;
	}
}
