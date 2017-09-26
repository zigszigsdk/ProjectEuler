package problem0011;

import java.util.ArrayList;

public class GridParser
{
	ArrayList<ArrayList<Integer>> stringToInt(String input, String delimiterY, String delimiterX)
	{
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		String[] rows = input.split(delimiterY);
		
		for(int rowIndex = 0; rowIndex <= rows.length-1; rowIndex++)
		{
			String[] rowInput = rows[rowIndex].split(delimiterX);
			
			ArrayList<Integer> rowOutput = new ArrayList<Integer>();
			
			for(int columnIndex = 0; columnIndex <= rowInput.length-1; columnIndex++)
				rowOutput.add(Integer.parseInt(rowInput[columnIndex]));
			
			result.add(rowOutput);
		}
		
		return result;
	}
}
