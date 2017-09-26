package problem0004;

public class Palindrome
{
	public boolean isValid(String candidate)
	{
		final int halfLengthFloor = (int)(candidate.length() / 2);
		final int lastIndex = candidate.length() -1;
		
		for(int index = 0; index < halfLengthFloor; index++)
			if(candidate.charAt(index) != candidate.charAt(lastIndex -index) )
				return false;

		return true;
	}
}
