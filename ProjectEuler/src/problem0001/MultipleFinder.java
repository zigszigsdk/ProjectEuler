package problem0001;

import java.util.ArrayList;

public class MultipleFinder 
{
	public ArrayList<Integer> getUnder(ArrayList<Integer> multipliers, int under)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int candidate = 1; candidate < under; candidate++)
			for(int multiplier : multipliers)
				if(candidate % multiplier == 0)
				{
					result.add(candidate);
					break;
				}
		
		return result;
	}
}
